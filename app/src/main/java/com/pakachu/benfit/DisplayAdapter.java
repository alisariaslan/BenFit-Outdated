package com.pakachu.benfit;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.CountDownTimer;
import android.os.IBinder;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DisplayAdapter extends RecyclerView.Adapter<DisplayAdapter.ViewHolder> {

    ArrayList<DisplayItem> displayItems;
    Activity activity;
    MainActivity mainActivity;

    public DisplayAdapter(Activity activity, MainActivity mainActivity, ArrayList<DisplayItem> displayItems) {
        this.activity = activity;
        this.mainActivity = mainActivity;
        this.displayItems = displayItems;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.display_item, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        DisplayItem displayItem = displayItems.get(position);
        if (displayItem.state == 0) {
            holder.cl_select_gender.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.to_up));
            holder.btn_man.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    select_gender(holder, true);
                }
            });
            holder.btn_women.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    select_gender(holder, false);
                }
            });
            holder.et_name_surname.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {

                }

                @Override
                public void afterTextChanged(Editable s) {
                    holder.tv_name_surname.setText("" + s);
                    holder.tv_name_surname.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.fadeinfast));
                }
            });
            holder.et_age.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {

                }

                @Override
                public void afterTextChanged(Editable s) {
                    holder.tv_age.setText(activity.getString(R.string.age) + ": " + s);
                    holder.tv_age.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.fadeinfast));
                }
            });
            holder.et_weight.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {

                }

                @Override
                public void afterTextChanged(Editable s) {
                    holder.tv_weight.setText(activity.getString(R.string.weight) + ": " + s);
                    holder.tv_weight.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.fadeinfast));
                }
            });
            holder.et_height.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {

                }

                @Override
                public void afterTextChanged(Editable s) {
                    holder.tv_height.setText(activity.getString(R.string.height) + ": " + s);
                    holder.tv_height.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.fadeinfast));
                }
            });
            holder.et_arm.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {

                }

                @Override
                public void afterTextChanged(Editable s) {
                    holder.tv_arm.setText(activity.getString(R.string.arm) + ": " + s);
                    holder.tv_arm.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.fadeinfast));
                }
            });
            holder.et_shoulder.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {

                }

                @Override
                public void afterTextChanged(Editable s) {
                    holder.tv_shoulder.setText(activity.getString(R.string.shoulder) + ": " + s);
                    holder.tv_shoulder.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.fadeinfast));
                }
            });
            holder.et_chest.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {

                }

                @Override
                public void afterTextChanged(Editable s) {
                    holder.tv_chest.setText(activity.getString(R.string.chest) + ": " + s);
                    holder.tv_chest.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.fadeinfast));
                }
            });
            holder.et_waist.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {

                }

                @Override
                public void afterTextChanged(Editable s) {
                    holder.tv_waist.setText(activity.getString(R.string.waist) + ": " + s);
                    holder.tv_waist.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.fadeinfast));
                }
            });
            holder.et_hips.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {

                }

                @Override
                public void afterTextChanged(Editable s) {
                    holder.tv_hips.setText(activity.getString(R.string.hips) + ": " + s);
                    holder.tv_hips.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.fadeinfast));
                }
            });
            holder.et_legs.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {

                }

                @Override
                public void afterTextChanged(Editable s) {
                    holder.tv_legs.setText(activity.getString(R.string.legs) + ": " + s);
                    holder.tv_legs.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.fadeinfast));
                }
            });
            holder.et_calf.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {

                }

                @Override
                public void afterTextChanged(Editable s) {
                    holder.tv_calf.setText(activity.getString(R.string.calf) + ": " + s);
                    holder.tv_calf.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.fadeinfast));
                }
            });
        } else {
            if (activity.getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE)
                holder.cl_display.setLayoutParams(new ConstraintLayout.LayoutParams(Resources.getSystem().getDisplayMetrics().widthPixels/3, ViewGroup.LayoutParams.MATCH_PARENT));
            holder.imageButton.setVisibility(View.VISIBLE);
            if (!displayItem.ismale)
                holder.iv_gender.setImageDrawable(AppCompatResources.getDrawable(activity, R.drawable.women_physique));
            holder.cl_select_gender.setVisibility(View.GONE);
            holder.cl_physique.setVisibility(View.VISIBLE);
            holder.cl_physique.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.fadeinslow));
            holder.tv_name_surname.setText(displayItem.name_surname + "\n(" + displayItem.date + ")");
            holder.tv_age.setText(activity.getString(R.string.age) + ": " + displayItem.age);
            holder.tv_weight.setText(activity.getString(R.string.weight) + ": " + displayItem.weight);
            holder.tv_height.setText(activity.getString(R.string.height) + ": " + displayItem.height);
            holder.tv_arm.setText(activity.getString(R.string.arm) + ": " + displayItem.arm);
            holder.tv_shoulder.setText(activity.getString(R.string.shoulder) + ": " + displayItem.shoulder);
            holder.tv_chest.setText(activity.getString(R.string.chest) + ": " + displayItem.chest);
            holder.tv_waist.setText(activity.getString(R.string.waist) + ": " + displayItem.waist);
            holder.tv_hips.setText(activity.getString(R.string.hips) + ": " + displayItem.hips);
            holder.tv_legs.setText(activity.getString(R.string.legs) + ": " + displayItem.legs);
            holder.tv_calf.setText(activity.getString(R.string.calf) + ": " + displayItem.calf);
            mainActivity.reset();
            holder.imageButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    v.setVisibility(View.GONE);
                    DisplayDB displayDB = new DisplayDB(activity);
                    displayDB.executeSQL("DELETE FROM " + DisplayDB.TABLE + " WHERE id=" + displayItem.id);
                    mainActivity.binding.rvMain.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.fadeout));
                    new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished) {

                        }

                        @Override
                        public void onFinish() {
                            mainActivity.setAdapter(false, "");
                        }
                    }.start();
                }
            });
        }
    }

    public void select_gender(ViewHolder holder, boolean ismale) {
        holder.cl_select_gender.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.fadeout));
        new CountDownTimer(1000, 1000) {

            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
                holder.cl_select_gender.clearAnimation();
                holder.cl_select_gender.setVisibility(View.GONE);
            }
        }.start();
        if (!ismale)
            holder.iv_gender.setImageDrawable(AppCompatResources.getDrawable(activity, R.drawable.women_physique));
        holder.cl_physique.setVisibility(View.VISIBLE);
        holder.cl_physique.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.lefttoright));
        new CountDownTimer(1000, 1000) {

            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
                holder.ll_details.setVisibility(View.VISIBLE);
                holder.ll_details.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.to_up));
            }
        }.start();
        holder.btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean passcard = true;
                String err = activity.getString(R.string.err);
                String name_surname = !holder.et_name_surname.getText().toString().trim().equals("") ? holder.et_name_surname.getText().toString().trim() : String.valueOf(passcard = false);
                String age = !holder.et_age.getText().toString().equals("") ? holder.et_age.getText().toString() : String.valueOf(passcard = false);
                String weight = !holder.et_weight.getText().toString().equals("") ? holder.et_weight.getText().toString() : String.valueOf(passcard = false);
                String height = !holder.et_height.getText().toString().equals("") ? holder.et_height.getText().toString() : String.valueOf(passcard = false);
                String arm = !holder.et_arm.getText().toString().equals("") ? holder.et_arm.getText().toString() : String.valueOf(passcard = false);
                String shoulder = !holder.et_shoulder.getText().toString().equals("") ? holder.et_shoulder.getText().toString() : String.valueOf(passcard = false);
                String chest = !holder.et_chest.getText().toString().equals("") ? holder.et_chest.getText().toString() : String.valueOf(passcard = false);
                String waist = !holder.et_waist.getText().toString().equals("") ? holder.et_waist.getText().toString() : String.valueOf(passcard = false);
                String hips = !holder.et_hips.getText().toString().equals("") ? holder.et_hips.getText().toString() : String.valueOf(passcard = false);
                String legs = !holder.et_legs.getText().toString().equals("") ? holder.et_legs.getText().toString() : String.valueOf(passcard = false);
                String calf = !holder.et_calf.getText().toString().equals("") ? holder.et_calf.getText().toString() : String.valueOf(passcard = false);
                String date = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date());
                if (passcard) {
                    ((InputMethodManager) activity.getSystemService(Activity.INPUT_METHOD_SERVICE)).hideSoftInputFromWindow(holder.btn_save.getWindowToken(), 0);
                    DisplayDB displayDB = new DisplayDB(activity);
                    displayDB.add(name_surname, ismale, Integer.parseInt(age), Float.parseFloat(weight), Integer.parseInt(height),
                            Float.parseFloat(arm), Float.parseFloat(shoulder), Float.parseFloat(chest), Float.parseFloat(waist),
                            Float.parseFloat(hips), Float.parseFloat(legs), Float.parseFloat(calf), date);
                    holder.cl_physique.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.fadeout));
                    mainActivity.binding.clSearch.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.fadein));
                    new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished) {

                        }

                        @Override
                        public void onFinish() {
                            mainActivity.binding.editTextTextPersonName.setEnabled(true);
                            mainActivity.setAdapter(false, "");
                        }
                    }.start();
                } else
                    Toast.makeText(activity, "" + err, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return displayItems.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        EditText et_name_surname, et_age, et_weight, et_height, et_arm, et_shoulder, et_chest, et_waist, et_hips, et_legs, et_calf;
        TextView tv_name_surname, tv_age, tv_weight, tv_height, tv_arm, tv_shoulder, tv_chest, tv_waist, tv_hips, tv_legs, tv_calf;
        ConstraintLayout cl_select_gender, cl_physique, cl_display;
        LinearLayout ll_details;
        Button btn_man, btn_women, btn_save;
        ImageView iv_gender;
        ImageButton imageButton;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            et_name_surname = itemView.findViewById(R.id.et_name_surname);
            et_age = itemView.findViewById(R.id.et_age);
            et_weight = itemView.findViewById(R.id.et_weight);
            et_height = itemView.findViewById(R.id.et_height);
            et_arm = itemView.findViewById(R.id.et_arm);
            et_shoulder = itemView.findViewById(R.id.et_shoulder);
            et_chest = itemView.findViewById(R.id.et_chest);
            et_waist = itemView.findViewById(R.id.et_waist);
            et_hips = itemView.findViewById(R.id.et_hips);
            et_legs = itemView.findViewById(R.id.et_legs);
            et_calf = itemView.findViewById(R.id.et_calf);
            tv_name_surname = itemView.findViewById(R.id.tv_name_surname);
            tv_age = itemView.findViewById(R.id.tv_age);
            tv_weight = itemView.findViewById(R.id.tv_weight);
            tv_height = itemView.findViewById(R.id.tv_height);
            tv_arm = itemView.findViewById(R.id.tv_arm);
            tv_shoulder = itemView.findViewById(R.id.tv_shoulder);
            tv_chest = itemView.findViewById(R.id.tv_chest);
            tv_waist = itemView.findViewById(R.id.tv_waist);
            tv_hips = itemView.findViewById(R.id.tv_hips);
            tv_legs = itemView.findViewById(R.id.tv_legs);
            tv_calf = itemView.findViewById(R.id.tv_calf);
            cl_select_gender = itemView.findViewById(R.id.cl_select_gender);
            cl_physique = itemView.findViewById(R.id.cl_physique);
            cl_display = itemView.findViewById(R.id.cl_display);
            ll_details = itemView.findViewById(R.id.ll_details);
            btn_man = itemView.findViewById(R.id.btn_man);
            btn_women = itemView.findViewById(R.id.btn_women);
            btn_save = itemView.findViewById(R.id.btn_save);
            iv_gender = itemView.findViewById(R.id.iv_gender);
            imageButton = itemView.findViewById(R.id.imageButton);
        }
    }

}