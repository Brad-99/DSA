def total_money(n):
    k = n // 7  # Calculate the number of complete weeks

    F = 28  # Fixed amount saved in the first week

    L = 28 + (k - 1) * 8  # Amount saved in the last complete week

    arithmetic_sum = k * (F + L) // 2  # Total amount saved in all full weeks

    monday = 1 + k  # Amount to start with on the Monday of the last (possibly incomplete) week

    final_week = sum(monday + day for day in range(n % 7))  # Amount saved in the last incomplete week

    return arithmetic_sum + final_week  # Total amount saved

# Main method to run the program
if __name__ == "__main__":
    # Prompt the user to enter a number
    n = int(input("Enter the number of days Hercy has saved money: "))

    # Call the total_money function and display the result
    print(f"Total money saved after {n} days: {total_money(n)}")
