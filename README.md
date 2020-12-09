# 2020-fall-cs160-team-ditto

## Paths
```
2020-fall-cs160-team-ditto
│   README.md
│       
└─── backend
|   └─── src/main
|   |    └─── java/com/grouped/grouped
|   |    |     | Backend files
|   |    |     |
|   |    |     └─── api
|   |    |     |    | Controllers
|   |    |     |    |
|   |    |     |    model
|   |    |     |    | Models / Classes that model data to be used in databases
|   |    |     |    |
|   |    |     |    service
|   |    |     |    | Service files to connect models to databases
|   |    |     resources
|   |    |     | Frontend files
|   |    |     |
|   |    |     └─── static
|   |    |     |     | All the CSS files and images
|   |    |     |     |
|   |    |     |     templates
|   |    |     |     | All the html files
|   |    |     |     |   
```

## Setting up the environment
1) Pull or download the repo onto your local machine.
2) Open your terminal or command line and change directories to the location of the project.
3) Change directories one final time to the 'backend' directory.
4) Run this command to run the springboot server: ```mvnw spring-boot:run```
6) The terminal should compile and run the spring server and then the terminal will stop moving when the 
    server is connected.
5) Open your web browser and type in the navbar: ```localhost:8080/index```
6) You should be able to access the web application from your browser. 

## Making Changes
1) Make your desired changes to the code
2) Re-run the command: ```mvnw spring-boot:run```
3) Re-connect to the webpage by refreshing or re-entering the ```localhost:8080/index```
4) Make a new branch and name it after the function that you added or changed. 
    Open a pull request afterwards if you are done with the function for review.

## User Guide
Click here to read the user manual: https://docs.google.com/document/d/1f2EHNyvJU3NIBvjCz4gx5lweUGNDytvpS7_v-hVmc8w/edit?usp=sharing
