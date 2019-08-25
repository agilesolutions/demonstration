# Package and Deploy Springboot applications with HELM 
Demonstrates how to deploy Springboot apps with HELM and inject environment specific (DEV/UAT/PROD...) application configuration on a kubernetes configmaps.

## Run this demonstration

* goto [Katacoda HELM course page](https://www.katacoda.com/courses/kubernetes/helm-package-manager)
* git clone https://github.com/agilesolutions/demonstration.git
* cd demonstration/charts/demo

## Verify, generate and install with HELM

```
helm lint .
helm template -f values.yaml .
helm install --name demo --set version=latest -f values.yaml .
```

## local skaffold build
[Understand skaffold profiles](https://skaffold.dev/docs/how-tos/profiles/)
```
skaffold build -p local
```


## Skaffold setting

1. [Image repository handling](https://skaffold.dev/docs/concepts/#image-repository-handling)
2. [Tagging strategies](https://skaffold.dev/docs/how-tos/taggers/)
3. [Deployers](https://skaffold.dev/docs/how-tos/deployers/)
4. [building Java Docker images has never been easier](https://cloud.google.com/blog/products/application-development/jib-1-0-0-is-ga-building-java-docker-images-has-never-been-easier)

## Debugging and terminal into demo container

1. watch kubectl get all -n demo
2. watch kubectl get pods -n demo
3. kubectl logs -f demo-xxx -n demo
4. kubectl exec -ti demo-xxx -n demo -- /bin/sh

## HELM connecting your cluster

* install kubectl 
* check your $HOME/.kube/config
* find out which cluster Tiller would install to with kubectl config current-context or kubectl cluster-info
* kubectl config get-contexts
* kubectl config use-context CONTEXT_NAME
