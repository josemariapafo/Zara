# Inditex Test

## Overview
The repository below contains a test for the Inditex company.

## Tecnologies
The project is being developed using Java 17 with Spring Boot. Domain-Driven Design (DDD) principles are being applied, 
along with hexagonal architecture, and adherence to SOLID, KISS, and Clean Code principles. 
An embedded database has been added to the project (H2) to facilitate testing by the provider, 
as it would otherwise be challenging to review its proper functioning.

## Guidelines
Follow the instructions below to start the application.

1. Clone this repository.

2. Switch to the develop or main branch.

3. Launch your preferred Integrated Development Environment (IDE), such as IntelliJ IDEA.

4. Once your IDE has completed indexing and downloading dependencies, configure the Java version to Java 17 in your IDE 
File -> Settings -> Gradle -> Gradle JVM.

5. Finally, right-click on the file ZaraApplication and select 'Run ZaraApplication.main()' to execute the application.

If the compilation fails, and this is due to MapStruct, you will need to remove all @Mapping annotations 
found in the project, compile again, and then rebuild and deploy the project with all @Mapping again.

## Annotations

# Data Base
I have utilized the NUMERIC data type to define the PRICE field in the PRICES database. I opted against using FLOAT due to its potential inaccuracies when rounding values. NUMERIC provides high precision typing, allowing for the representation of decimal numbers with a defined precision, in this case, two decimal places.
http://www.h2database.com/html/datatypes.html#numeric_type

The index I've created for the productId field is idx_product_id on the PRICES table. This index is created to optimize searches based on the productId column. By sorting the data in the table by productId and then creating an index on this column, it allows for more efficient searches using binary search algorithms. Binary search algorithms rely on data being sorted to quickly locate specific values. With the data sorted by productId, the binary search can swiftly pinpoint the desired records, enhancing query performance.

# Response Model
In the output parameters, I have included "curr" to denote the type of currency.

## To Improve
In the database, there are functions that you will later call from the backend. This is a more secure approach than directly querying the database, as it gives you control over which users have permissions to execute those functions. Additionally, it allows you to manage permissions based on the user with which you log in to the database.