# 1. Import the necessary libraries
import requests
from bs4 import BeautifulSoup

# 2. Send a get() request and fetch the webpage contents
response = requests.get("https://www.training-support.net/webelements/tables")
webpage_content = response.content

# 3. Create a BeautifulSoup Object
soup = BeautifulSoup(webpage_content, "html.parser")

# 4. Target the specific table we want
table = soup.find('table')

# 5. Scrape the data in the table
for tr in table.find_all('tr'):    # For all the rows in the table
    cells = tr.find_all('td')      # find all the cells
    row = [i.text for i in cells] # iterate through the cells and store the data in a list
    print(row)                    # print the rows