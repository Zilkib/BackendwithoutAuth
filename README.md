# Klinisches Anwendungsprojekt - Server Repository

This is an extension of an project created by [aaron3636](https://github.com/aaron3636) and [GravityDarkLab](https://github.com/GravityDarkLab). The Readme was slightly adapted , all rights belong to them.

His Repository of the [FrontEnd](https://github.com/aaron3636/KAPFrontEnd) and [BackEnd](https://github.com/aaron3636/KAP).





Welcome to the Klinisches Anwendungsprojekt (Clinical Application Project) server repository! This project comprises a server and a client application designed to streamline the testing of clinical data resources. The server is built upon the open-source [Hapi-FHIR](https://hapifhir.io/) project.
## Table of Contents

- [Introduction](#introduction)
- [Frontend Integration](frontend-integration)
- [Client - PatientGenerator](#client---patientgenerator)
- [Server Configuration](#server-configuration)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [Acknowledgment](#acknowledgment)
- [License](#license)

## Introduction

In the context of clinical applications, it is crucial to have a reliable and easy-to-use environment for testing different resources. This project aims to extend the already existing [CAP](https://github.com/GravityDarkLab/Clinical-Application-Project) . The server, based on Hapi-FHIR, offers various RESTful endpoints.

## Frontend Integration

This server repository is designed to seamlessly integrate with the frontend component of the project, available in the repository [FrontendwithoutAuth](https://github.com/Zilkib/FrontendwithoutAuth.git). Together, these two repositories offer a comprehensive solution for clinical application testing, providing a user-friendly interface to interact with the clinical data resources.

I invite you to explore the [FrontendwithoutAuth](https://github.com/Zilkib/FrontendwithoutAuth.git) repository to leverage the full potential of the Klinisches Anwendungsprojekt. The frontend enhances the overall user experience and complements the functionality of the server.

## Client - PatientGenerator

The `PatientGenerator-client` is a mock client application designed to generate random patient data and interact with the server through HTTP requests. This allows users to simulate real-world scenarios and test the server's handling of different resources. The client is a valuable tool for validating the server's functionality and performance.

## Server Configuration

The `server` directory contains the Hapi-FHIR-based server, which serves as the core component of this project. I have customized the server to suit the specific requirements of our clinical application, by removing the authentification and adding Conditions. 
## Getting Started

To get started with the Klinisches Anwendungsprojekt, follow these steps:

1. **Clone the Repository:** Begin by cloning this repository to your local machine using the following command:
   ```
   git clone https://github.com/your-username/your-repo.git
   ```

2. **Configure the Server:** Navigate to the `server` directory and follow the provided instructions to set up and configure the server. Ensure that you have all the required dependencies installed.

3. **Build the Client:** Next, go to the `PatientGenerator-client` directory. If needed, update the configurations to match your server's endpoint. Then, build the client application as per the instructions provided in the `README.md` file of the client directory.

4. **Testing:** With both the server and the client ready, you can now start testing the server's response to various resources and HTTP methods using the PatientGenerator client.

## Usage

Once you have set up the project and the server is running, you can use the PatientGenerator-client to generate random patient data and interact with the server. This is especially useful for testing the server's handling of different resources, such as creating, updating, and deleting patients.

Refer to the server's `README.md` for more details.

## Acknowledgment

Special thanks to [aaron3636](https://github.com/aaron3636) and [GravityDarkLab](https://github.com/GravityDarkLab).

## License

The Klinisches Anwendungsprojekt is distributed under the [MIT License](LICENSE). You are free to use, modify, and distribute the code as per the terms of the license.

---

Thank you for your interest in the Klinisches Anwendungsprojekt. If you have any questions or need further assistance, please don't hesitate to reach out to me. Happy testing!
