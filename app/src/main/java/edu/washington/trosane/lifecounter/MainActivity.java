package edu.washington.trosane.lifecounter;

        import android.support.v7.app.ActionBarActivity;
        import android.os.Bundle;
        import android.view.Menu;
        import android.view.MenuItem;
        import android.view.View;
        import android.widget.TextView;

public class MainActivity extends ActionBarActivity {
    private int life1 = 20;
    private int life2 = 20;
    private int life3 = 20;
    private int life4 = 20;
    private int loser = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState!=null) {
            life1 = savedInstanceState.getInt("Player1");
            life2 = savedInstanceState.getInt("Player2");
            life3 = savedInstanceState.getInt("Player3");
            life4 = savedInstanceState.getInt("Player4");
            loser = savedInstanceState.getInt("loser");

            TextView t1 = (TextView) findViewById(R.id.P1life);
            t1.setText("" + life1);
            TextView t2 = (TextView) findViewById(R.id.P2life);
            t2.setText("" + life2);
            TextView t3 = (TextView) findViewById(R.id.P3life);
            t3.setText("" + life3);
            TextView t4 = (TextView) findViewById(R.id.P4life);
            t4.setText("" + life4);
            TextView loserText = (TextView) findViewById(R.id.loser);

            if(loser != 0) {
                loserText.setText("Player " + loser + " LOSES!");
                View c = findViewById(R.id.loser);
                c.setVisibility(View.VISIBLE);
            }

        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("Player1", life1);
        savedInstanceState.putInt("Player2", life2);
        savedInstanceState.putInt("Player3", life3);
        savedInstanceState.putInt("Player4", life4);
        savedInstanceState.putInt("loser", loser);
    }

    public void P1buttonTouch(View view) {
        if (view.getId() == R.id.one_upP1) {
            life1++;
            TextView t = (TextView) findViewById((R.id.P1life));
            t.setText("" + life1);
        } else if (view.getId() == R.id.one_downP1) {
            life1--;
            TextView t = (TextView) findViewById((R.id.P1life));
            t.setText("" + life1);
        } else if (view.getId() == R.id.five_upP1) {
            life1 += 5;
            TextView t = (TextView) findViewById((R.id.P1life));
            t.setText("" + life1);
        } else if (view.getId() == R.id.five_downP1) {
            life1 -= 5;
            TextView t = (TextView) findViewById((R.id.P1life));
            t.setText("" + life1);
        }
        loser(view);
    }

    public void P2buttonTouch(View view) {
        if (view.getId() == R.id.one_upP2) {
            life2++;
            TextView t = (TextView)findViewById((R.id.P2life));
            t.setText("" + life2);
        } else if (view.getId() == R.id.one_downP2) {
            life2--;
            TextView t = (TextView)findViewById((R.id.P2life));
            t.setText("" + life2);
        } else if (view.getId() == R.id.five_upP2){
            life2+=5;
            TextView t = (TextView)findViewById((R.id.P2life));
            t.setText("" + life2);
        } else if (view.getId() == R.id.five_downP2){
            life2-=5;
            TextView t = (TextView)findViewById((R.id.P2life));
            t.setText("" + life2);
        }
        loser(view);
    }

    public void P3buttonTouch(View view) {
        if (view.getId() == R.id.one_upP3) {
            life3++;
            TextView t = (TextView)findViewById((R.id.P3life));
            t.setText("" + life3);
        } else if (view.getId() == R.id.one_downP3) {
            life3--;
            TextView t = (TextView)findViewById((R.id.P3life));
            t.setText("" + life3);
        } else if (view.getId() == R.id.five_upP3){
            life3+=5;
            TextView t = (TextView)findViewById((R.id.P3life));
            t.setText("" + life3);
        } else if (view.getId() == R.id.five_downP3){
            life3-=5;
            TextView t = (TextView)findViewById((R.id.P3life));
            t.setText("" + life3);
        }
        loser(view);
    }

    public void P4buttonTouch(View view) {
        if (view.getId() == R.id.one_upP4) {
            life4++;
            TextView t = (TextView)findViewById((R.id.P4life));
            t.setText("" + life4);
        } else if (view.getId() == R.id.one_downP4) {
            life4--;
            TextView t = (TextView)findViewById((R.id.P4life));
            t.setText("" + life4);
        } else if (view.getId() == R.id.five_upP4){
            life4+=5;
            TextView t = (TextView)findViewById((R.id.P4life));
            t.setText("" + life4);
        } else if (view.getId() == R.id.five_downP4){
            life4-=5;
            TextView t = (TextView)findViewById((R.id.P4life));
            t.setText("" + life4);
        }
        loser(view);
    }

    public void loser(View view) {
        if (life1 <= 0 || life2 <= 0 || life3 <= 0 || life4 <= 0) {
            if (life1 <= 0) {
                loser = 1;
            } else if (life2 <= 0) {
                loser = 2;
            } else if (life3 <= 0) {
                loser = 3;
            } else if (life4 <= 0) {
                loser = 4;
            }

            TextView loserText = (TextView) findViewById(R.id.loser);
            loserText.setText("Player " + loser + " LOSES!");
            View loserView = findViewById(R.id.loser);
            loserView.setVisibility(View.VISIBLE);
        }
    }
}