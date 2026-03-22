# GraphQL Rest Assured Test

## Overview

This project contains a simple automated API test using Rest Assured to execute a GraphQL query against the public endpoint:
https://countries.trevorblades.com/


The test retrieves a list of continents and countries using a GraphQL query.

## What This Test Does

* Sends a POST request to a GraphQL endpoint
* Executes a query to fetch:

* Continents (code, name)
* Countries (name, code, capital, emoji)
* Prints the response to the console
* One assertion for country name from the Json

## GraphQL Query Used

graphql
query {
  continents {
    code
    name
  }
  countries {
    name
    code
    capital
    emoji
  }
}


## Technologies Used

Java
Rest Assured
TestNG
GraphQL


## How It Works

1. Builds a GraphQL request body with the query
2. Sends it as a JSON payload
3. Receives and logs the response


##Setup Instructions

1. Add dependencies (Maven):

xml
<dependency>
    <groupId>io.rest-assured</groupId>
    <artifactId>rest-assured</artifactId>
    <version>5.4.0</version>
</dependency>

<dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>7.9.0</version>
    <scope>test</scope>
</dependency>


2. Run the test using your IDE or TestNG runner.

---
##Expected Output

A JSON response containing:

List of continents
List of countries with details


## Notes

* GraphQL requests must be sent as JSON with a "query" field
* Avoid manually constructing JSON strings, use Map for reliability
* Ensure the query is properly formatted and includes the "query" keyword


## Summary

This test demonstrates how to:

* Integrate GraphQL with Rest Assured
* Execute queries programmatically
* Validate API responses in an automated test
