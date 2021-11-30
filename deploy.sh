kubectl delete deployments hotel
docker build -t fab/hotel .
kubectl apply -f deployment.yaml
