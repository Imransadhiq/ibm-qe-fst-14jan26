# import pandas
from turtle import pd
import pandas


data = {
  "Vehicle Type": ["Car", "Car", "Bike"],
  "Manufacturer": ["Maruti", "Toyota", "Royal Enfield"],
  "Model": ["Swift", "Corolla", "Thunderbird"]
}

# Create a new DataFrame using the data
dataframe = pandas.DataFrame(data)

# Write the data to a csv file
dataframe.to_csv("vehicles.csv")

table = pd.DataFrame("vehicles.csv")