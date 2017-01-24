# hexxagon_bot
This is a java bot.Which playes a game on hexxagonal board with player.Rules and some other code related stuff is below>>
Hexxagon is a two player board game which is played on a 6X7

grid of cells. Each player has an allocated color, Red ( First Player ) or White ( Second Player ) being conventional.

The board is customised. Instead of square board, we will be using rectangular board with hexagonal cells. Figure below shows the coordinates of each cell.

enter image description here

Players take turns by either spreading or jumping to an empty cell.

Spreading means adding a new piece adjacent to an existing one of their own color.
Jumping means moving a piece of their own color two spaces away.

Whenever a piece is placed adjacent to opposing pieces, all the adjacent opposing pieces will get infected, meaning replaced with current player's piece.

The game will end after 100
moves ( 50

moves for each player ) or when any of the players don't have any move left. At the end of the game the player with majority of stone will win.

We will play it on an 6X7
grid. The top left of the grid is [0,0] and the bottom right is [5,6]. The rule is that a cell[i,j]

is adjacent to any of cells which share same side.

Input:
The input will be a 6X7
matrix consisting only of 0,1 and 2. Next line will contain an integer denoting the total number of moves till the current state of the board. Next line contains an integer - 1 or 2

which is your player id.

In the given matrix, top-left is [0,0]
and bottom-right is [5,6]

. The y-coordinate increases from left to right, and x-coordinate increases from top to bottom.

The cell marked 0
means it doesn't contain any stones. The cell marked 1 means it contains first player's stone which is Red in color. The cell marked 2

means it contains second player's stone which is white in color.

Output:
In the first line print the coordinates of the cell separated by space, the piece he / she wants to spread or jump. In the next line print the coordinates of the cell in which the piece will spread or jump.
You must take care that you don't print invalid coordinates. For example, [1,1]
might be a valid coordinate in the game play if [1,1] is adjacent or is at two spaces away from the piece that you are going to move, but [9,10]

will never be. Also if you play an invalid move or your code exceeds the time/memory limit while determining the move, you lose the game.

Starting state
The starting state of the game is the state of the board before the game starts.
1 0 0 0 0 0 2
0 0 0 0 0 0 0
0 0 0 0 0 0 0
0 0 0 0 0 0 0
0 0 0 0 0 0 0
2 0 0 0 0 0 1
0

First Input
This is the input give to the first player at the start of the game.
1 0 0 0 0 0 2
0 0 0 0 0 0 0
0 0 0 0 0 0 0
0 0 0 0 0 0 0
0 0 0 0 0 0 0
2 0 0 0 0 0 1
0
1

Here is the code of the Default Bot: Code
SAMPLE INPUT

1 0 0 0 0 0 2
0 0 1 2 0 0 0
0 0 0 0 0 0 0
0 0 2 0 0 0 0
0 0 0 0 0 0 2
2 0 0 0 2 0 1
10
1

SAMPLE OUTPUT

1 2
2 2

Explanation

This is player 1
's turn and the player will move the piece at [1,2] and will spread a new piece to [2,2]

.

enter image description here

As you can see in the image that [1,3]
and [3,2] are adjacent to [2,2] so both the pieces at [1,3] and [3,2] will get replaced by 1

. After the move the state of game will become:

1 0 0 0 0 0 2
0 0 1 1 0 0 0
0 0 1 0 0 0 0
0 0 1 0 0 0 0
0 0 0 0 0 0 2
2 0 0 0 2 0 1
11

This state will be fed as input to program of player 2

.

Other valid move is:

1 2
0 4 
