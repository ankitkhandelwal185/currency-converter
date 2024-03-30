# Currency Converter Application

This is a simple currency converter application built using Java Spring Boot. It allows users to convert between different currencies using an external currency conversion API.

## Implementation Details

- **Backend**: Implemented in Java Spring Boot.
- **Frontend**: A simple HTML page with JavaScript for user input and displaying results.
- **API Used**: ExchangeRate-API for fetching currency exchange rates.

### Prerequisites

- Java Development Kit (JDK) installed on your system.
- Gradle installed on your system.

### Running the Project

1. Clone the repository to your local machine:

    ```
    git clone <repository-url>
    ```

2. Navigate to the project directory:

    ```
    cd currency-converter
    ```

3. Build the project using Gradle:

    ```
    ./gradlew build
    ```

4. Run the Spring Boot application:

    ```
    ./gradlew bootRun
    ```

5. Access the application in your web browser at [http://localhost:8080/index.html](http://localhost:8080/index.html).

### Usage

- Enter the source currency, target currency, and source amount in the input fields.
- Click the "Convert" button to see the converted amount displayed below the form.
