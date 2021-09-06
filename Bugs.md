# Bugs

### Bug 1:

**Description:** Logging out from the Profile page, leaves the profile information of the user still visible.

**Steps to Reproduce:** Log in to the Buggy Cars Rating website, click on Profile to enter the Profile information page. Click on Log-out.

**Actual Behaviour:** The user is logged out of the application, however the website view is still on the Profile information page, with all the users information still visible.

**Expected Behaviour:** When the user logs out of the application, the home page should be displayed. From a security perspective it is not good to leave a user's personal information displayed once logged off.

### Bug 2:

**Description:** Total number of votes for the Popular make is incorrect. 

**Steps to Reproduce:** Go to the Buggy Cars Rating website. On the home page, note the number of votes for the Car make that is displayed in the Popular Make section (example - Lamborghini, 7251 votes). Click on the Popular make section. Sum up the votes of all the car models displayed. 

**Actual Behaviour:** The total number of votes displayed in the Popular make section on the home page is different from the number of votes calculated by adding the votes of the different models.

**Expected Behaviour:** One of the primary purposes of the website is for people to view different car models and vote on them, thereby determining the most popular car make and model. The calculation of the votes is key to this purpose being served. It is very important that the number of votes is calculated correctly.

### Bug 3:

**Description:** The sorting on the “Votes” column in the “Popular Make” page does not work properly.

**Steps to Reproduce:** Go to the Buggy Cars Rating website, click on “Popular Make”. In the Popular make page, click on the “Votes” column header. 

**Actual Behaviour:** Prior to clicking on “Votes”, the displayed list is sorted in descending order of the number of votes, with the highest voted model displayed first and the lowest voted model displayed last. On clicking on “Votes”, the display order changes randomly without any sort of order. The only way to recover from this is to refresh the page. 

**Expected Behaviour:** Sorting needs to be either ascending or descending at all times.

## Test Summary

Overall the user friendliness of the website is poor, with inconsistent behaviour throughout the application (Navigation to home page working only from certain pages, sorting working only on certain columns, author being displayed only for certain car models etc). The screen layout of the different elements are also not optimal. With inconsistencies in the header, footer and the font, the general feeling that one gets is that the website is not very trustworthy.
