# Part A


### My Approach
* I checked if a username was available and if it is then it will make that object for Account with the username. If the username wasn't available, then it starts adding digits until there is a available username.
### Course Connections
* It was just removing the end number at the end and adding a new number at the end of the username.
### What Gave Me Trouble
* I didn't know how to remove the number at the end at first but was able to figure it out later.

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# Part B


## My Approach
* I used a while loop to go through the username one character at a time. If the next character was a hyphen then I skipped both the current character and the hypen by increasing index by 2. Otherwise,  I add the current character to the shortened string.
## Course Connections
* This included string traversals using loops and using .substring() to access individual characters.
## What Gave Me Trouble
* I had to be careful with index positions when checking the next character. It was very easy to accidentally go out of bounds or skip the wrong characters so I had a few syntax mixtakes with .length().
## What I Would Do Differently 
* I would probably use charAt() instead of substring() because it makes the code shorter.
