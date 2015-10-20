package com.mygdx.game;

import java.sql.Struct;

/**
 * Created by Peter on 2015-10-20.
 */

enum PlayerNo
{
    player1,
    player2,
    player3,
    plater4,
    Unknown
}

enum GameDifficulty
{
    easy,
    medium,
    hard,
    veryHard,
    impossible
}

public class Communication {

    private String mServerLocation;
    private boolean mIsLobbyHost;
    private PlayerNo mPlayerNumber;
    private boolean[] mIsPlayersReady;
    private int mGold;
    private int mKills;
    private int mLivesLeft;
    private float positionX;
    private float positionY;

    static class GameOtions
    {
        public int NumberOfLives;
        public int StartingGold;
        public GameDifficulty gameDifficulty;
    }

    /** Prefered Constructor */
    public Communication(String serverLocation, boolean isLobbyHost)
    {
        mServerLocation = serverLocation;
        mIsLobbyHost = isLobbyHost;
        mPlayerNumber = PlayerNo.Unknown;
        mIsPlayersReady = new boolean[]{false,false,false,false};
        mGold = -1000;
        mKills = -1000;
        mLivesLeft = -1000;
        positionX = 0;
        positionY = 0;
    }

    public Communication(String serverLocation, boolean isLobbyHost,int startingGold, int livesLeft, PlayerNo playerNumber)
    {
        mServerLocation = serverLocation;
        mIsLobbyHost = isLobbyHost;
        mPlayerNumber = playerNumber;
        mIsPlayersReady = new boolean[]{false,false,false,false};
        mGold = startingGold;
        mKills = 0;
        mLivesLeft = livesLeft;
        positionX = 0;
        positionY = 0;
    }

    public Communication(String serverLocation)
    {
        mServerLocation = serverLocation;
        mIsLobbyHost = false;
        mPlayerNumber = PlayerNo.Unknown;
        mIsPlayersReady = new boolean[]{false,false,false,false};
        mGold = 0;
        mKills = 0;
        mLivesLeft = 0;
        positionX = 0;
        positionY = 0;
    }


    private void UpdatePointerPos(float x, float y)
    {}

    private void EnterLobby(String lobbyName)
    {
        //first get which player spots are avalable.
        //then update true to an empty slot and set the program to that also.
        //Get the other players information.(name)
        //upload player information. (name)
        //set listener to your player information.
        //set listener to lobby ready state.
    }

    private void CreateLobby()
    {
        // Set a lobby name. check if there is an empty lobby.
        // Put yourself as player one, lobby host and fill all the nodes with default data to make sure that it is correct.
        // Fill the gameoptions with default data.
    }

    private void GetListOfLobbys()
    {
        // Download the list of active gamelobbys.
        // Use the names to get how many players there are in each game.
    }

    /** Send the changes to firebase but onely the lobbyhost is allowed
     * the button acktivating this should be grayed out if it is not the lobby host
     * */
    private void CommitGameOptions(GameOtions gameOptions)
    {
        if(mIsLobbyHost)
        {
            //do the things!!
        }
    }
}
