
import pandas as ps

data = {
    "Usernames": ["admin", "Charles", "Deku"],
    "Passwords": ["password", "Charl13", "AllMight"]
}
dataframe = ps.DataFrame(data)
print(dataframe)
print("=========usernames==========================")
print(dataframe["Usernames"])
print("===========index 1 username and password=========================")
print(dataframe["Usernames"][1],dataframe["Passwords"][1])
print("===============sorted username=====================")
print(dataframe.sort_values("Usernames", ascending = True))
print("================sorted password====================")
print(dataframe.sort_values("Passwords" , ascending = False))
print("====================================")
dataframe.to_csv("UserCred.csv", index =False)

