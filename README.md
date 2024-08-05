# Medical supply system

## Overview

Medical supply is a centralized web application designed for managing the procurement, reservation, and distribution of medical equipment to private hospitals. This system streamlines the process for hospitals to reserve and collect equipment while allowing administrators to manage sales reports and track company registrations.

In this project, we implemented some of the additional functionalities, such as: a solution for competitive access to the database, system scalability, location services (leaflet), etc.

## Key features

- **User registration and authentication**
  - Manage detailed profiles for employees, administrators, and clients.
  - Handle user authentication with role-based access control.

- **Company management**
  - Register and manage multiple companies involved in the procurement process.
  - Maintain comprehensive records for each registered company, including profiles, equipment lists, and ratings.

- **Equipment reservation management**
  - Allow hospitals to reserve medical equipment and schedule collection times, with QR code integration.
  - Track reservation statuses and manage equipment availability efficiently.

- **Sales reporting and analytics**
  - Enable administrators to input, manage, and analyze sales reports.
  - Generate detailed reports and visual analytics for informed decision-making.
 
- **Concurrent access to database resources solution**
  - We addressed this issue using pessimistic and optimistic locking.
  - **Pessimistic Locking**: Applied to prevent multiple users from booking the same equipment or scheduling overlapping collection times, ensuring exclusive access during critical operations.
  - **Optimistic Locking**: Implemented using a version number column for each entity. This allows concurrent access but checks for conflicts by comparing version numbers before committing changes, suitable for scenarios with less frequent data conflicts.

- **Scalability**
  - We need to propose an architecture that ensures the application can handle a significant number of concurrent users and high reservation volumes. The architecture should be highly scalable and available to accommodate up to 100 million users and 500,000 monthly reservations.

## Proof of Concept application architecture
- Our Proof of Concept (PoC) includes:
    1. **Database schema design**
      - We have developed a logical database schema to support scalable data management, which ensures efficient data organization and retrieval.

    2. **Data partitioning strategy**
      - Data is partitioned horizontally by reserving times based on the month of booking, allowing for efficient querying and management of reservation data.

    3. **Database replication strategy**
      - We implemented master-slave replication with asynchronous data synchronization to ensure high availability and consistency of critical data.

    4. **Data caching strategy**
      - We utilized L1 caching via Hibernate and L2 caching with EhCache to optimize data retrieval for frequently accessed but rarely changed data.

    5. **Hardware resource estimation**
      - We estimated storage needs for the next 5 years, predicting a requirement of approximately 475 terabytes to accommodate 100 million users and 30 million reservations.

    6. **Load balancing strategy**
      - We implemented a "Weighted Round Robin" strategy to distribute traffic based on server capacity, and manage geographical load distribution.

    7. **User operations to monitor for system improvement**
      - We monitored system performance using Prometheus for metrics collection and Grafana for visualization, focusing on server performance and user experience enhancement.

    8. **Complete architecture diagram**
    - We provided a detailed architecture diagram illustrating application servers, database servers, caching servers, and their interactions to support scalability and high availability.


## Technologies

- Back-end: Java + Spring Boot
- Front-end: Angular + REST services
- Database: Relational (PostgreSQL)

## Getting started

To set up the project locally, follow these steps:
1. Clone the repository
2. Set up the backend using Java and Spring Boot
3. Set up the frontend using Angular
4. Configure the database using pgAdmin

## Contributors

[Milica Petrović](https://github.com/petrovicmilica)

[Ana Radovanović](https://github.com/anciii13)

[Kristina Zelić](https://github.com/zelick)

Anja Kovačević
