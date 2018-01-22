package com.wealthdoctor.bill_reminder.activity;

import android.app.DatePickerDialog;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

import com.wealthdoctor.R;

import java.util.Calendar;


public class BillReminderDetailActivity extends AppCompatActivity implements View.OnClickListener {

    private TextInputEditText selectDateEditText;
    private TextInputEditText amountEditText;
    private TextInputEditText informationEditText;
    private TextInputEditText addNoteEditText;

    private TextView monthlyText;
    private TextView biMonthlyText;
    private TextView quarterlyText;
    private TextView halfYearlyText;
    private TextView yearlyText;

    private View coloredView;
    private View dummyView;

    private String monthly;
    private String biMonthly;
    private String halfYearly;
    private String quarterly;
    private String yearly;
    private String dueDate;
    private String dueAmount;
    private String information;

    private boolean billFrequency;

    private int mYear, mMonth, mDay, mHour, mMinute;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill_reminder_detail);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // toolbar fancy stuff
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Add Bill Account");


        selectDateEditText = (TextInputEditText) findViewById(R.id.bill_reminder_due_date_edittext);
        amountEditText = (TextInputEditText) findViewById(R.id.bill_reminder_amount_edittext);
        informationEditText = (TextInputEditText) findViewById(R.id.bill_reminder_information_edittext);
        dummyView = (View) findViewById(R.id.dummyView);
        addNoteEditText = (TextInputEditText) findViewById(R.id.bill_reminder_note);

        monthlyText = (TextView) findViewById(R.id.bill_reminder_monthly);
        halfYearlyText = (TextView) findViewById(R.id.bill_reminder_half_yearly);
        biMonthlyText = (TextView) findViewById(R.id.bill_reminder_bi_monthly);
        yearlyText = (TextView) findViewById(R.id.bill_reminder_yearly);
        quarterlyText = (TextView) findViewById(R.id.bill_reminder_quarterly);

        monthlyText.setOnClickListener(this);
        halfYearlyText.setOnClickListener(this);
        biMonthlyText.setOnClickListener(this);
        yearlyText.setOnClickListener(this);
        quarterlyText.setOnClickListener(this);

        coloredView = dummyView;

        dueAmount = amountEditText.getText().toString();
        information = informationEditText.getText().toString();


    }


    public void selectDueDate(View view) {
        if (view == selectDateEditText) {

            // Get Current Date
            selectDateEditText.setFocusableInTouchMode(true);
            selectDateEditText.setFocusable(true);


            final Calendar c = Calendar.getInstance();
            mYear = c.get(Calendar.YEAR);
            mMonth = c.get(Calendar.MONTH);
            mDay = c.get(Calendar.DAY_OF_MONTH);


            DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                    new DatePickerDialog.OnDateSetListener() {

                        @Override
                        public void onDateSet(DatePicker view, int year,
                                              int monthOfYear, int dayOfMonth) {


                            selectDateEditText.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);

                        }
                    }, mYear, mMonth, mDay);
            datePickerDialog.show();

        }
        dueDate = selectDateEditText.getText().toString();
    }

    @Override
    public void onClick(View view) {

        billFrequency = true;
        if (view == monthlyText && billFrequency == true && coloredView != view) {
            billFrequency = false;
            //Toast.makeText(this, "monthly", Toast.LENGTH_SHORT).show();
           // monthly = monthlyText.getText().toString();
            monthlyText.setBackgroundColor(Color.BLUE);
            coloredView.setBackgroundColor(getResources().getColor(R.color.textColorBackground));
            coloredView = monthlyText;

            monthlyText.setTextColor(getResources().getColor(R.color.bill_reminder_detail_activity_textView_color));

            biMonthlyText.setTextColor(getResources().getColor(R.color.bill_reminder_textView_textColor));
            halfYearlyText.setTextColor(getResources().getColor(R.color.bill_reminder_textView_textColor));
            yearlyText.setTextColor(getResources().getColor(R.color.bill_reminder_textView_textColor));
            quarterlyText.setTextColor(getResources().getColor(R.color.bill_reminder_textView_textColor));
        } else if (view == biMonthlyText && billFrequency == true && coloredView != view) {
            billFrequency = false;
            //Toast.makeText(this, "biMonthly", Toast.LENGTH_SHORT).show();
            biMonthlyText.setBackgroundColor(Color.BLUE);
            biMonthly = biMonthlyText.getText().toString();
            coloredView.setBackgroundColor(getResources().getColor(R.color.textColorBackground));
            coloredView = view;

            biMonthlyText.setTextColor(getResources().getColor(R.color.bill_reminder_detail_activity_textView_color));
            monthlyText.setTextColor(getResources().getColor(R.color.bill_reminder_textView_textColor));
            halfYearlyText.setTextColor(getResources().getColor(R.color.bill_reminder_textView_textColor));
            yearlyText.setTextColor(getResources().getColor(R.color.bill_reminder_textView_textColor));
            quarterlyText.setTextColor(getResources().getColor(R.color.bill_reminder_textView_textColor));
        } else if (view == quarterlyText && billFrequency == true && coloredView != view) {
            billFrequency = false;
            //Toast.makeText(this, "quarterlyText", Toast.LENGTH_SHORT).show();
            quarterlyText.setBackgroundColor(Color.BLUE);
            quarterly = quarterlyText.getText().toString();
            coloredView.setBackgroundColor(getResources().getColor(R.color.textColorBackground));
            coloredView = view;

            quarterlyText.setTextColor(getResources().getColor(R.color.bill_reminder_detail_activity_textView_color));
            monthlyText.setTextColor(getResources().getColor(R.color.bill_reminder_textView_textColor));
            halfYearlyText.setTextColor(getResources().getColor(R.color.bill_reminder_textView_textColor));
            yearlyText.setTextColor(getResources().getColor(R.color.bill_reminder_textView_textColor));
            biMonthlyText.setTextColor(getResources().getColor(R.color.bill_reminder_textView_textColor));
        } else if (view == halfYearlyText && billFrequency == true && coloredView != view) {
            billFrequency = false;
            //Toast.makeText(this, "halfYearly", Toast.LENGTH_SHORT).show();
            halfYearlyText.setBackgroundColor(Color.BLUE);
            halfYearly = halfYearlyText.getText().toString();
            coloredView.setBackgroundColor(getResources().getColor(R.color.textColorBackground));
            coloredView = view;

            halfYearlyText.setTextColor(getResources().getColor(R.color.bill_reminder_detail_activity_textView_color));
            monthlyText.setTextColor(getResources().getColor(R.color.bill_reminder_textView_textColor));
            quarterlyText.setTextColor(getResources().getColor(R.color.bill_reminder_textView_textColor));
            yearlyText.setTextColor(getResources().getColor(R.color.bill_reminder_textView_textColor));
            biMonthlyText.setTextColor(getResources().getColor(R.color.bill_reminder_textView_textColor));
        } else if (view == yearlyText && billFrequency == true && coloredView != view) {
            billFrequency = false;
            //Toast.makeText(this, "yearly", Toast.LENGTH_SHORT).show();
            yearlyText.setBackgroundColor(Color.BLUE);
            yearlyText.setTextColor(getResources().getColor(R.color.bill_reminder_detail_activity_textView_color));
            yearly = yearlyText.getText().toString();
            coloredView.setBackgroundColor(getResources().getColor(R.color.textColorBackground));
            coloredView = view;

            monthlyText.setTextColor(getResources().getColor(R.color.bill_reminder_textView_textColor));
            quarterlyText.setTextColor(getResources().getColor(R.color.bill_reminder_textView_textColor));
            halfYearlyText.setTextColor(getResources().getColor(R.color.bill_reminder_textView_textColor));
            biMonthlyText.setTextColor(getResources().getColor(R.color.bill_reminder_textView_textColor));
        }
    }

    public void resetBackground(View view) {


    }

    public void fabReminderSave(View view) {


    }
}