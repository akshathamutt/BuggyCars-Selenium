# Test Approach

## Objective

To perform functional testing of the Buggy Cars Rating application and determine if any critical scenarios are broken. 

Functional areas:

- Log-in
- Registration
- Profile 
- Voting
- Popular make 
- Popular model 
- Overall rating  

As no written requirements are available for the application, exploratory testing will be performed with a focus on important work flows of the application.

## Scope 

- Functional testing
- Browser - Google Chrome
- Automate critical scenarios

## Automation 

Scenarios to automate will be considered based on the following:

- Functionality that is used repetitively
- Functionality that is critical to the working of the application
- Functionality that is stable and not subject to constant change
- Functionality that is time consuming to test manually, and is tested frequently as part of Smoke and Regression testing

Critical scenarios selected for automation:

1. As a valid user I can log-in and vote for a desired car model
2. As a valid user I can change my password
3. As a new user I can register 
4. As a valid user I can update details on the profile page
5. Validating fields in the registration page

Browser Supported - Google Chrome

## Tools
```
IDE - Eclipse 
Programming language - Java
Automation tool - Selenium WebDriver 
Automation framework - TestNG
Apache POI (Java library for reading files)
```
## Test Design 

## Test Summary

Overall the user friendliness of the website is poor, with inconsistent behaviour throughout the application (Navigation to home page working only from certain pages, sorting working only on certain columns, author being displayed only for certain car models etc). The screen layout of the different elements are also not optimal. With inconsistencies in the header, footer and the font, the general feeling that one gets is that the website is not very trustworthy.

