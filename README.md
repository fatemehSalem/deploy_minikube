# deploy_minikube
deploy spring boot with minikube
Deploying a Spring Boot application on Minikube involves several steps, including creating a Kubernetes Deployment configuration, exposing the application with a Service, and accessing its API. Here's a step-by-step guide to help you achieve this:

1_ minikube start

2_Dockerize Your Spring Boot Application (docker build -t your-app-image:v1 .)

3_ Create a Kubernetes Deployment Configuration (deployment.yml)

4_Create a Kubernetes Service Configuration (service.yml)

5_ Apply Deployments and Services

kubectl apply -f deployment.yml

kubectl apply -f service.yml

6_minikube service your-app-service --url


