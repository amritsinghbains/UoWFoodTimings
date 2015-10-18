package com.amrit.uowfoodtimings;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.SpannableString;
import android.text.format.Time;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class ScrollingActivity extends AppCompatActivity {

    static SimpleDateFormat parser = new SimpleDateFormat("dd MM yyyy HH:mm");

    String getParsedDate(String s) {
        Calendar calendar = Calendar.getInstance();
        try {
            String temp = calendar.get(Calendar.DATE) + " " + (calendar.get(Calendar.MONTH)+1) + " " + calendar.get(Calendar.YEAR) + " " + s;
//            System.out.println(temp);
            return temp;
        } catch (Exception e) {
            return new Date().toString();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //init
        Calendar calendar = Calendar.getInstance();

        String[] days = new String[] {"SATURDAY", "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" };

        final int day = calendar.get(Calendar.DAY_OF_WEEK);
        Timings[] marketplaceCaw = new Timings[7];
//        ArrayList<Timings> marketplaceCaw = new ArrayList<Timings>();

        Timings marketplaceCaw0 = new Timings();
        Timings marketplaceCaw1 = new Timings();
        Timings marketplaceCaw2 = new Timings();
        Timings marketplaceCaw3 = new Timings();
        Timings marketplaceCaw4 = new Timings();
        Timings marketplaceCaw5 = new Timings();
        Timings marketplaceCaw6 = new Timings();

        Timings[] pizzaPizza = new Timings[7];
//        ArrayList<Timings> pizzaPizza = new ArrayList<Timings>();

        Timings pizzaPizza0 = new Timings();
        Timings pizzaPizza1 = new Timings();
        Timings pizzaPizza2 = new Timings();
        Timings pizzaPizza3 = new Timings();
        Timings pizzaPizza4 = new Timings();
        Timings pizzaPizza5 = new Timings();
        Timings pizzaPizza6 = new Timings();

        Timings[] subway = new Timings[7];
//        ArrayList<Timings> subway = new ArrayList<Timings>();

        Timings subway0 = new Timings();
        Timings subway1 = new Timings();
        Timings subway2 = new Timings();
        Timings subway3 = new Timings();
        Timings subway4 = new Timings();
        Timings subway5 = new Timings();
        Timings subway6 = new Timings();

        Timings[] homecookedLunch = new Timings[7];
//        ArrayList<Timings> homecookedLunch = new ArrayList<Timings>();

        Timings homecookedLunch0 = new Timings();
        Timings homecookedLunch1 = new Timings();
        Timings homecookedLunch2 = new Timings();
        Timings homecookedLunch3 = new Timings();
        Timings homecookedLunch4 = new Timings();
        Timings homecookedLunch5 = new Timings();
        Timings homecookedLunch6 = new Timings();

        Timings[] homecookedDinner = new Timings[7];
//        ArrayList<Timings> homecookedDinner = new ArrayList<Timings>();

        Timings homecookedDinner0 = new Timings();
        Timings homecookedDinner1 = new Timings();
        Timings homecookedDinner2 = new Timings();
        Timings homecookedDinner3 = new Timings();
        Timings homecookedDinner4 = new Timings();
        Timings homecookedDinner5 = new Timings();
        Timings homecookedDinner6 = new Timings();

        Timings[] crocBreakfast = new Timings[7];
//        ArrayList<Timings> crocBreakfast = new ArrayList<Timings>();

        Timings crocBreakfast0 = new Timings();
        Timings crocBreakfast1 = new Timings();
        Timings crocBreakfast2 = new Timings();
        Timings crocBreakfast3 = new Timings();
        Timings crocBreakfast4 = new Timings();
        Timings crocBreakfast5 = new Timings();
        Timings crocBreakfast6 = new Timings();

        Timings[] crocDinner = new Timings[7];
//        ArrayList<Timings> crocDinner = new ArrayList<Timings>();

        Timings crocDinner0 = new Timings();
        Timings crocDinner1 = new Timings();
        Timings crocDinner2 = new Timings();
        Timings crocDinner3 = new Timings();
        Timings crocDinner4 = new Timings();
        Timings crocDinner5 = new Timings();
        Timings crocDinner6 = new Timings();

        Timings[] meditteraneanGrill = new Timings[7];
//        ArrayList<Timings> meditteraneanGrill = new ArrayList<Timings>();

        Timings meditteraneanGrill0 = new Timings();
        Timings meditteraneanGrill1 = new Timings();
        Timings meditteraneanGrill2 = new Timings();
        Timings meditteraneanGrill3 = new Timings();
        Timings meditteraneanGrill4 = new Timings();
        Timings meditteraneanGrill5 = new Timings();
        Timings meditteraneanGrill6 = new Timings();

        Timings[] burgerBar = new Timings[7];
//        ArrayList<Timings> burgerBar = new ArrayList<Timings>();

        Timings burgerBar0 = new Timings();
        Timings burgerBar1 = new Timings();
        Timings burgerBar2 = new Timings();
        Timings burgerBar3 = new Timings();
        Timings burgerBar4 = new Timings();
        Timings burgerBar5 = new Timings();
        Timings burgerBar6 = new Timings();

        Timings[] dividends = new Timings[7];
//        ArrayList<Timings> dividends = new ArrayList<Timings>();

        Timings dividends0 = new Timings();
        Timings dividends1 = new Timings();
        Timings dividends2 = new Timings();
        Timings dividends3 = new Timings();
        Timings dividends4 = new Timings();
        Timings dividends5 = new Timings();
        Timings dividends6 = new Timings();

        Timings[] timHortons = new Timings[7];
//        ArrayList<Timings> timHortons = new ArrayList<Timings>();

        Timings timHortons0 = new Timings();
        Timings timHortons1 = new Timings();
        Timings timHortons2 = new Timings();
        Timings timHortons3 = new Timings();
        Timings timHortons4 = new Timings();
        Timings timHortons5 = new Timings();
        Timings timHortons6 = new Timings();

        Timings[] bruAlumni = new Timings[7];
        Timings[] bruToldo = new Timings[7];
//        ArrayList<Timings> bruAlumni = new ArrayList<Timings>();

        Timings bruAlumni0 = new Timings();
        Timings bruAlumni1 = new Timings();
        Timings bruAlumni2 = new Timings();
        Timings bruAlumni3 = new Timings();
        Timings bruAlumni4 = new Timings();
        Timings bruAlumni5 = new Timings();
        Timings bruAlumni6 = new Timings();

        Timings[] brownGoldCafe = new Timings[7];
//        ArrayList<Timings> brownGoldCafe = new ArrayList<Timings>();

        Timings brownGoldCafe0 = new Timings();
        Timings brownGoldCafe1 = new Timings();
        Timings brownGoldCafe2 = new Timings();
        Timings brownGoldCafe3 = new Timings();
        Timings brownGoldCafe4 = new Timings();
        Timings brownGoldCafe5 = new Timings();
        Timings brownGoldCafe6 = new Timings();

        Timings[] hubCEI = new Timings[7];
//        ArrayList<Timings> hubCEI = new ArrayList<Timings>();

        Timings hubCEI0 = new Timings();
        Timings hubCEI1 = new Timings();
        Timings hubCEI2 = new Timings();
        Timings hubCEI3 = new Timings();
        Timings hubCEI4 = new Timings();
        Timings hubCEI5 = new Timings();
        Timings hubCEI6 = new Timings();

        Date d1,d2;
        System.out.println(marketplaceCaw1.d1);
//        marketplaceCaw0.d1 = getParsedDate("0:01");

        try {
   // static SimpleDateFormat parser = new SimpleDateFormat("dd MM yyyy HH:mm");

//            System.out.println(getParsedDate(calendar.get(Calendar.DATE) + " " + calendar.get(Calendar.MONTH) + " " + calendar.get(Calendar.YEAR) + " 23:00"));



//            marketplaceCaw[] = new Timings(getParsedDate("00:00"), getParsedDate("00:00"));

            marketplaceCaw[0] = new Timings(getParsedDate("00:00"), getParsedDate("00:00"));
            marketplaceCaw[1] = new Timings(getParsedDate("00:00"), getParsedDate("00:00"));
            marketplaceCaw[2] = new Timings(getParsedDate("07:30"), getParsedDate("21:00"));
            marketplaceCaw[3] = new Timings(getParsedDate("07:30"), getParsedDate("21:00"));
            marketplaceCaw[4] = new Timings(getParsedDate("07:30"), getParsedDate("21:00"));
            marketplaceCaw[5] = new Timings(getParsedDate("07:30"), getParsedDate("21:00"));
            marketplaceCaw[6] = new Timings(getParsedDate("07:30"), getParsedDate("17:30"));


            pizzaPizza[0] =  new Timings(getParsedDate("11:30"), getParsedDate("16:30"));
            pizzaPizza[1] =  new Timings(getParsedDate("11:30"), getParsedDate("16:30"));
            pizzaPizza[2] =  new Timings(getParsedDate("11:00"), getParsedDate("19:00"));
            pizzaPizza[3] =  new Timings(getParsedDate("11:00"), getParsedDate("19:00"));
            pizzaPizza[4] =  new Timings(getParsedDate("11:00"), getParsedDate("19:00"));
            pizzaPizza[5] =  new Timings(getParsedDate("11:00"), getParsedDate("19:00"));
            pizzaPizza[6] =  new Timings(getParsedDate("11:50"), getParsedDate("17:00"));


            subway[0] =  new Timings(getParsedDate("00:00"), getParsedDate("00:00"));
            subway[1] =  new Timings(getParsedDate("00:00"), getParsedDate("00:00"));
            subway[2] =  new Timings(getParsedDate("11:00"), getParsedDate("17:00"));
            subway[3] =  new Timings(getParsedDate("11:00"), getParsedDate("17:00"));
            subway[4] =  new Timings(getParsedDate("11:00"), getParsedDate("17:00"));
            subway[5] =  new Timings(getParsedDate("11:00"), getParsedDate("17:00"));
            subway[6] =  new Timings(getParsedDate("11:00"), getParsedDate("17:00"));


            homecookedLunch[0] = new Timings(getParsedDate("00:00"), getParsedDate("00:00"));
            homecookedLunch[1] = new Timings(getParsedDate("00:00"), getParsedDate("00:00"));
            homecookedLunch[2] = new Timings(getParsedDate("11:30"), getParsedDate("14:00"));
            homecookedLunch[3] = new Timings(getParsedDate("11:30"), getParsedDate("14:00"));
            homecookedLunch[4] = new Timings(getParsedDate("11:30"), getParsedDate("14:00"));
            homecookedLunch[5] = new Timings(getParsedDate("11:30"), getParsedDate("14:00"));
            homecookedLunch[6] = new Timings(getParsedDate("11:30"), getParsedDate("14:00"));


            homecookedDinner[0] =  new Timings(getParsedDate("00:00"), getParsedDate("00:00"));
            homecookedDinner[1] =  new Timings(getParsedDate("00:00"), getParsedDate("00:00"));
            homecookedDinner[2] =  new Timings(getParsedDate("16:30"), getParsedDate("19:00"));
            homecookedDinner[3] =  new Timings(getParsedDate("16:30"), getParsedDate("19:00"));
            homecookedDinner[4] =  new Timings(getParsedDate("16:30"), getParsedDate("19:00"));
            homecookedDinner[5] =  new Timings(getParsedDate("16:30"), getParsedDate("19:00"));
            homecookedDinner[6] =  new Timings(getParsedDate("00:00"), getParsedDate("00:00"));



            crocBreakfast[0] = new Timings(getParsedDate("09:30"), getParsedDate("13:30"));
            crocBreakfast[1] = new Timings(getParsedDate("09:30"), getParsedDate("13:30"));
            crocBreakfast[2] = new Timings(getParsedDate("07:45"), getParsedDate("12:00"));
            crocBreakfast[3] = new Timings(getParsedDate("07:45"), getParsedDate("12:00"));
            crocBreakfast[4] = new Timings(getParsedDate("07:45"), getParsedDate("12:00"));
            crocBreakfast[5] = new Timings(getParsedDate("07:45"), getParsedDate("12:00"));
            crocBreakfast[6] = new Timings(getParsedDate("07:45"), getParsedDate("12:00"));

            crocDinner[0] = new Timings(getParsedDate("17:00"),  getParsedDate("23:00"));
            crocDinner[1] = new Timings(getParsedDate("17:00"),  getParsedDate("23:00"));
            crocDinner[2] = new Timings(getParsedDate("19:00"),  getParsedDate("23:00"));
            crocDinner[3] = new Timings(getParsedDate("19:00"),  getParsedDate("23:00"));
            crocDinner[4] = new Timings(getParsedDate("19:00"),  getParsedDate("23:00"));
            crocDinner[5] = new Timings(getParsedDate("19:00"),  getParsedDate("23:00"));
            crocDinner[6] = new Timings(getParsedDate("17:00"),  getParsedDate("23:00"));

            meditteraneanGrill[0] = new Timings(getParsedDate("12:00"), getParsedDate("17:00"));
            meditteraneanGrill[1] = new Timings(getParsedDate("12:00"), getParsedDate("17:00"));
            meditteraneanGrill[2] = new Timings(getParsedDate("11:30"), getParsedDate("19:00"));
            meditteraneanGrill[3] = new Timings(getParsedDate("11:30"), getParsedDate("19:00"));
            meditteraneanGrill[4] = new Timings(getParsedDate("11:30"), getParsedDate("19:00"));
            meditteraneanGrill[5] = new Timings(getParsedDate("11:30"), getParsedDate("19:00"));
            meditteraneanGrill[6] = new Timings(getParsedDate("11:30"), getParsedDate("17:00"));


            burgerBar[0] = new Timings(getParsedDate("00:00"), getParsedDate("00:00"));
            burgerBar[1] = new Timings(getParsedDate("00:00"), getParsedDate("00:00"));
            burgerBar[2] = new Timings(getParsedDate("11:30"), getParsedDate("19:00"));
            burgerBar[3] = new Timings(getParsedDate("11:30"), getParsedDate("19:00"));
            burgerBar[4] = new Timings(getParsedDate("11:30"), getParsedDate("19:00"));
            burgerBar[5] = new Timings(getParsedDate("11:30"), getParsedDate("19:00"));
            burgerBar[6] = new Timings(getParsedDate("11:30"), getParsedDate("17:00"));



            dividends[0] = new Timings(getParsedDate("00:00"), getParsedDate("00:00"));
            dividends[1] = new Timings(getParsedDate("00:00"), getParsedDate("00:00"));
            dividends[2] = new Timings(getParsedDate("08:00"), getParsedDate("19:00"));
            dividends[3] = new Timings(getParsedDate("08:00"), getParsedDate("19:00"));
            dividends[4] = new Timings(getParsedDate("08:00"), getParsedDate("19:00"));
            dividends[5] = new Timings(getParsedDate("08:00"), getParsedDate("19:00"));
            dividends[6] = new Timings(getParsedDate("08:00"), getParsedDate("14:30"));


            timHortons[0] = new Timings(getParsedDate("00:00"), getParsedDate("00:00"));
            timHortons[1] = new Timings(getParsedDate("00:00"), getParsedDate("00:00"));
            timHortons[2] = new Timings(getParsedDate("09:00"), getParsedDate("17:00"));
            timHortons[3] = new Timings(getParsedDate("09:00"), getParsedDate("17:00"));
            timHortons[4] = new Timings(getParsedDate("09:00"), getParsedDate("17:00"));
            timHortons[5] = new Timings(getParsedDate("09:00"), getParsedDate("17:00"));
            timHortons[6] = new Timings(getParsedDate("09:00"), getParsedDate("17:00"));


            bruAlumni[0] = new Timings(getParsedDate("17:00"), getParsedDate("23:00"));
            bruAlumni[1] = new Timings(getParsedDate("17:00"), getParsedDate("23:00"));
            bruAlumni[2] = new Timings(getParsedDate("17:00"), getParsedDate("23:00"));
            bruAlumni[3] = new Timings(getParsedDate("17:00"), getParsedDate("23:00"));
            bruAlumni[4] = new Timings(getParsedDate("17:00"), getParsedDate("23:00"));
            bruAlumni[5] = new Timings(getParsedDate("17:00"), getParsedDate("23:00"));
            bruAlumni[6] = new Timings(getParsedDate("17:00"), getParsedDate("23:00"));

            bruToldo[0] = new Timings(getParsedDate("00:00"), getParsedDate("00:00"));
            bruToldo[1] = new Timings(getParsedDate("00:00"), getParsedDate("00:00"));
            bruToldo[2] = new Timings(getParsedDate("09:00"), getParsedDate("18:00"));
            bruToldo[3] = new Timings(getParsedDate("09:00"), getParsedDate("18:00"));
            bruToldo[4] = new Timings(getParsedDate("09:00"), getParsedDate("18:00"));
            bruToldo[5] = new Timings(getParsedDate("09:00"), getParsedDate("18:00"));
            bruToldo[6] = new Timings(getParsedDate("09:00"), getParsedDate("15:00"));



            brownGoldCafe[0] = new Timings(getParsedDate("00:00"), getParsedDate("00:00"));
            brownGoldCafe[1] = new Timings(getParsedDate("00:00"), getParsedDate("00:00"));
            brownGoldCafe[2] = new Timings(getParsedDate("10:00"), getParsedDate("21:00"));
            brownGoldCafe[3] = new Timings(getParsedDate("10:00"), getParsedDate("21:00"));
            brownGoldCafe[4] = new Timings(getParsedDate("10:00"), getParsedDate("21:00"));
            brownGoldCafe[5] = new Timings(getParsedDate("10:00"), getParsedDate("21:00"));
            brownGoldCafe[6] = new Timings(getParsedDate("10:00"), getParsedDate("16:00"));



            hubCEI[0] = new Timings(getParsedDate("00:00"), getParsedDate("00:00"));
            hubCEI[1] = new Timings(getParsedDate("00:00"), getParsedDate("00:00"));
            hubCEI[2] = new Timings(getParsedDate("08:00"), getParsedDate("19:00"));
            hubCEI[3] = new Timings(getParsedDate("08:00"), getParsedDate("19:00"));
            hubCEI[4] = new Timings(getParsedDate("08:00"), getParsedDate("19:00"));
            hubCEI[5] = new Timings(getParsedDate("08:00"), getParsedDate("19:00"));
            hubCEI[6] = new Timings(getParsedDate("08:00"), getParsedDate("14:30"));

            addHelpText(R.id.marketplaceCaw, parser.parse(marketplaceCaw[day].d1), parser.parse(marketplaceCaw[day].d2));
            addHelpText(R.id.pizzaPizza, parser.parse(pizzaPizza[day].d1), parser.parse(pizzaPizza[day].d2));
            addHelpText(R.id.subway, parser.parse(subway[day].d1), parser.parse(subway[day].d2));
            addHelpText(R.id.homecookedLunch, parser.parse(homecookedLunch[day].d1), parser.parse(homecookedLunch[day].d2));
            addHelpText(R.id.homecookedDinner, parser.parse(homecookedDinner[day].d1), parser.parse(homecookedDinner[day].d2));
            addHelpText(R.id.crocBreakfast, parser.parse(crocBreakfast[day].d1), parser.parse(crocBreakfast[day].d2));
            addHelpText(R.id.crocDinner, parser.parse(crocDinner[day].d1), parser.parse(crocDinner[day].d2));

            addHelpText(R.id.meditteraneanGrill, parser.parse(meditteraneanGrill[day].d1), parser.parse(meditteraneanGrill[day].d2));
            addHelpText(R.id.burgerBar, parser.parse(burgerBar[day].d1), parser.parse(burgerBar[day].d2));
            addHelpText(R.id.dividends, parser.parse(dividends[day].d1), parser.parse(dividends[day].d2));
            addHelpText(R.id.timHortons, parser.parse(timHortons[day].d1), parser.parse(timHortons[day].d2));

            addHelpText(R.id.bruAlumni, parser.parse(bruAlumni[day].d1), parser.parse(bruAlumni[day].d2));
            addHelpText(R.id.bruToldo, parser.parse(bruToldo[day].d1), parser.parse(bruToldo[day].d2));
            addHelpText(R.id.brownGoldCafe, parser.parse(brownGoldCafe[day].d1), parser.parse(brownGoldCafe[day].d2));
            addHelpText(R.id.hubCEI, parser.parse(hubCEI[day].d1), parser.parse(hubCEI[day].d2));




        }catch(Exception e){
            System.out.println("jiiii");
        }

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Snackbar.make(view, "Refreshing Time", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                Intent intent = getIntent();
                finish();
                startActivity(intent);

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scrolling, menu);
        for (int i = 0; i < menu.size(); i++)
            menu.getItem(i).setVisible(false);
        return true;
    }

    public void addHelpText(int finder, Date d1, Date d2) {
        TextView textViewToChange;
        Date d = new Date();

//        System.out.println("aaj hai");
//        System.out.println(d);
//        System.out.println(d1);
//        System.out.println(d2);

        textViewToChange = (TextView) findViewById(finder);

        String rawDisplay;
        String rawMinutes2 = "" + d2.getMinutes();
        if(d2.getMinutes()/10 == 0){
            rawMinutes2 = "0" + d2.getMinutes();
        }
        String rawMinutes1 = "" + d1.getMinutes();
        if(d1.getMinutes()/10 == 0){
            rawMinutes1 = "0" + d1.getMinutes();
        }
        if (d1.before(d) && d2.after(d)) {
            rawDisplay = textViewToChange.getText() + " open till " + d2.getHours() + ":" + rawMinutes2;
        } else {
                rawDisplay = textViewToChange.getText() + " closed, opens at " + d1.getHours() + ":" + rawMinutes1;
        }
        SpannableString spanString = new SpannableString(rawDisplay);
        spanString.setSpan(new StyleSpan(Typeface.BOLD), 0, textViewToChange.getText().length(), 0);
        spanString.setSpan(new StyleSpan(Typeface.ITALIC), textViewToChange.getText().length(), rawDisplay.length(), 0);

        if (d1.before(d) && d2.after(d)) {
            spanString.setSpan(new ForegroundColorSpan(Color.rgb(0, 100, 0)), textViewToChange.getText().length(), rawDisplay.length(), 0);
        } else {
            spanString.setSpan(new ForegroundColorSpan(Color.RED), textViewToChange.getText().length(), rawDisplay.length(), 0);
        }
        textViewToChange.setText(spanString);


    }

    @SuppressWarnings("rawtypes")
    public static Object getValueOf(Object clazz, String lookingForValue)
            throws Exception {
        Field field = clazz.getClass().getField(lookingForValue);
        Class clazzType = field.getType();
        if (clazzType.toString().equals("double"))
            return field.getDouble(clazz);
        else if (clazzType.toString().equals("int"))
            return field.getInt(clazz);
        // else other type ...
        // and finally
        return field.get(clazz);
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
}
