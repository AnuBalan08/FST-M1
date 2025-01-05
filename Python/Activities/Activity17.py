
import pandas as ps

data = {
    "Usernames": ["admin", "Charles", "Deku"],
    "Passwords": ["password", "Charl13", "AllMight"]
}
dataframe = ps.DataFrame(data)
dataframe.to_csv("UserCred.csv", index =False)