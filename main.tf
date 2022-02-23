provider "kubernetes" {
	config_path    = "~/.kube/config"
	config_context = "minikube"
}

resource "kubernetes_namespace" "platform-interview" {
	metadata {
		name = "platform-interview"
	}
}

provider "helm" {
	kubernetes {
		config_path      = "~/.kube/config"
		config_context   = "minikube"
	}
}

resource "helm_release" "local" {
	name      = "platform-interview"
	chart     = "./platform-interview"
	namespace = "platform-interview"
}
