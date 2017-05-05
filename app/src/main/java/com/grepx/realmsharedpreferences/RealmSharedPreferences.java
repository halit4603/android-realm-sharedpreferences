package com.grepx.realmsharedpreferences;

import android.content.SharedPreferences;
import android.support.annotation.Nullable;
import io.realm.Realm;
import java.util.Map;
import java.util.Set;

public class RealmSharedPreferences implements SharedPreferences {

  public RealmSharedPreferences(String name) {
  }

  @Override public Map<String, ?> getAll() {
    return null;
  }

  @Nullable @Override public String getString(String key, @Nullable String defValue) {
    Realm realm = Realm.getDefaultInstance();
    RealmSharedPref realmSharedPref = realm.where(RealmSharedPref.class).findFirst();
    return realmSharedPref != null ? realmSharedPref.valueString : null;
  }

  @Nullable @Override public Set<String> getStringSet(String key, @Nullable Set<String> defValues) {
    return null;
  }

  @Override public int getInt(String key, int defValue) {
    return 0;
  }

  @Override public long getLong(String key, long defValue) {
    return 0;
  }

  @Override public float getFloat(String key, float defValue) {
    return 0;
  }

  @Override public boolean getBoolean(String key, boolean defValue) {
    return false;
  }

  @Override public boolean contains(String key) {
    return false;
  }

  @Override public Editor edit() {
    return null;
  }

  @Override public void registerOnSharedPreferenceChangeListener(
      OnSharedPreferenceChangeListener listener) {

  }

  @Override public void unregisterOnSharedPreferenceChangeListener(
      OnSharedPreferenceChangeListener listener) {

  }
}
