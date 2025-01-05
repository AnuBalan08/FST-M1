
import pandas as pd
# from pandas import ExcelWriter

data = {
    'FirstName' :["Satvik", "Avinash", "Lahri"],
    'LastName' :["Shah", "Kati", "Rath"],
    'Email' :["satshah@example.com", "avinashK@example.com", "lahri.rath@example.com"],
    'PhoneNumber' :["4537829158", "4892184058", "4528727830"]
}

dataframe = pd.DataFrame(data)

dataframe.to_excel("info.xlsx", sheet_name="sheet1", index=False)
print("Excel created successfully")


