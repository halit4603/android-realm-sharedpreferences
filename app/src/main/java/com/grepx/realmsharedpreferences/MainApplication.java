package com.grepx.realmsharedpreferences;

import android.app.Application;
import io.realm.Realm;

public class MainApplication extends Application {
  @Override public void onCreate() {
    super.onCreate();
    Realm.init(this);
  }
}
