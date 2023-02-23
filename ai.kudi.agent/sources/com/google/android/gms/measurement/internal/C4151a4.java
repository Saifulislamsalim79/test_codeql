package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.a4 */
/* loaded from: classes2.dex */
public final class C4151a4 {

    /* renamed from: a */
    private final String f9994a;

    /* renamed from: b */
    private final Bundle f9995b;

    /* renamed from: c */
    private Bundle f9996c;

    /* renamed from: d */
    final /* synthetic */ g4 f9997d;

    public C4151a4(g4 g4Var, String str, Bundle bundle) {
        this.f9997d = g4Var;
        com.google.android.gms.common.internal.s.f("default_event_parameters");
        this.f9994a = "default_event_parameters";
        this.f9995b = new Bundle();
    }

    /* renamed from: a */
    public final Bundle m28411a() {
        char c;
        if (this.f9996c == null) {
            String string = this.f9997d.o().getString(this.f9994a, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            String string2 = jSONObject.getString("n");
                            String string3 = jSONObject.getString("t");
                            int hashCode = string3.hashCode();
                            if (hashCode == 100) {
                                if (string3.equals("d")) {
                                    c = 1;
                                }
                                c = 65535;
                            } else if (hashCode != 108) {
                                if (hashCode == 115 && string3.equals("s")) {
                                    c = 0;
                                }
                                c = 65535;
                            } else {
                                if (string3.equals("l")) {
                                    c = 2;
                                }
                                c = 65535;
                            }
                            if (c == 0) {
                                bundle.putString(string2, jSONObject.getString("v"));
                            } else if (c == 1) {
                                bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                            } else if (c != 2) {
                                ((v5) this.f9997d).a.b().r().m28013b("Unrecognized persisted bundle type. Type", string3);
                            } else {
                                bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            ((v5) this.f9997d).a.b().r().m28014a("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.f9996c = bundle;
                } catch (JSONException unused2) {
                    ((v5) this.f9997d).a.b().r().m28014a("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (this.f9996c == null) {
                this.f9996c = this.f9995b;
            }
        }
        return this.f9996c;
    }

    /* renamed from: b */
    public final void m28410b(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        SharedPreferences.Editor edit = this.f9997d.o().edit();
        if (bundle.size() == 0) {
            edit.remove(this.f9994a);
        } else {
            String str = this.f9994a;
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        jSONObject.put("v", obj.toString());
                        if (obj instanceof String) {
                            jSONObject.put("t", "s");
                        } else if (obj instanceof Long) {
                            jSONObject.put("t", "l");
                        } else if (obj instanceof Double) {
                            jSONObject.put("t", "d");
                        } else {
                            ((v5) this.f9997d).a.b().r().m28013b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                        }
                        jSONArray.put(jSONObject);
                    } catch (JSONException e) {
                        ((v5) this.f9997d).a.b().r().m28013b("Cannot serialize bundle value to SharedPreferences", e);
                    }
                }
            }
            edit.putString(str, jSONArray.toString());
        }
        edit.apply();
        this.f9996c = bundle;
    }
}
