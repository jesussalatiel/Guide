# DevOps Guide Study

## Selenium Grid
Is a proxy server based on hub-nodes atchitecture. It facilitates easy proccess to run tests in parallel across multples nodes (machines).

For example: A hub can be connected to three different nodes, each running a separate borwser or different browser version.

## Docker Compose

Compose is a tool for defining and running multi-container Dockere applications. With Compose, you use a YAML file to configure your application's services. 

Then, with a single command you can start and tear down the whole infrastructure consisting of multiple services.

[Reference](https://medium.com/@nitinbhardwaj6/selenium-grid-with-docker-c8ecb0d8404) to execute compose.

```bash
- docker-compose -f /path/docker-compose.yml up -d
- docker-compose -f /path/docker-compose.yml down
```

## Usage

```yml
version: "3"
services: # Contains the list of the images and theirs configurations
  hub: #Container Name
    image: selenium/hub # is defines which image will be used 
    ports: # Publish ports with host:container format
      - "4444:4444"

    environment:
      GRID_MAX_SESSION: 16
      GRID_BROWSER_TIMEOUT: 3000
      GRID_TIMEOUT: 3000

  chrome-debug:
    image: selenium/node-chrome-debug
    container_name: web-automation_chrome-debug
    depends_on: # This defines the required dependecy before spinning up the container.
      - hub
    environment:
      HUB_PORT_4444_TCP_ADDR: hub
      HUB_PORT_4444_TCP_PORT: 4444
      NODE_MAX_SESSION: 4 #Defines how many instances of the same version of browser can run over the Remote System
      NODE_MAX_INSTANCES: 4 # Defines how many browsers can run in parallel at a time in the remote system
    volumes:
      - /dev/shm:/dev/shm
    ports:
      - "49154:5900"
    links:
      - hub

  firefox-debug: 
    image: selenium/node-firefox-debug
    container_name: web-automation_firefox-debug
    depends_on:
      - hub
    environment:
      HUB_PORT_4444_TCP_ADDR: hub
      HUB_PORT_4444_TCP_PORT: 4444
      NODE_MAX_SESSION: 4
      NODE_MAX_INSTANCES: 4
    volumes:
      - /dev/shm:/dev/shm
    ports:
      - "49153:5900"
    links:
      - hub

```

## Yarn
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License
[MIT](https://choosealicense.com/licenses/mit/)