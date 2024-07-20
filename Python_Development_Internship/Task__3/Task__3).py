import time

def count_seconds():
    for i in range(60):
        if i < 10:
            print(f"\r00:0{i}", end='', flush=True)
        else:
            print(f"\r00:{i}", end='', flush=True)
        time.sleep(1)  # Sleep for 1 second

    print("\nCounting has finished.")

# Call the function to start counting
count_seconds()
