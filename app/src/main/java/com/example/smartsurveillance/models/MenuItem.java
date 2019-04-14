package com.example.smartsurveillance.models;

import android.content.Intent;
import android.media.Image;

public class MenuItem {
    private String item;
    private int icon_id;
    private Intent intent;

    public MenuItem() {
    }

    public MenuItem(String item, int icon_id, Intent intent) {
        this.item = item;
        this.icon_id = icon_id;
        this.intent = intent;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getIcon_id() {
        return icon_id;
    }

    public void setIcon_id(int icon_id) {
        this.icon_id = icon_id;
    }

    public Intent getIntent() {
        return intent;
    }

    public void setIntent(Intent intent) {
        this.intent = intent;
    }
}
