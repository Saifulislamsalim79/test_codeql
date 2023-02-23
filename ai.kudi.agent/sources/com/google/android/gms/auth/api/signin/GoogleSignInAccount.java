package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
import com.google.android.gms.common.util.C2970h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
public class GoogleSignInAccount extends AbstractC2916a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new C2696b();

    /* renamed from: A */
    private String f7606A;

    /* renamed from: B */
    List<Scope> f7607B;

    /* renamed from: C */
    private String f7608C;

    /* renamed from: D */
    private String f7609D;

    /* renamed from: E */
    private Set<Scope> f7610E = new HashSet();

    /* renamed from: c */
    final int f7611c;

    /* renamed from: d */
    private String f7612d;

    /* renamed from: e */
    private String f7613e;

    /* renamed from: f */
    private String f7614f;

    /* renamed from: w */
    private String f7615w;

    /* renamed from: x */
    private Uri f7616x;

    /* renamed from: y */
    private String f7617y;

    /* renamed from: z */
    private long f7618z;

    static {
        C2970h.m31533c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List<Scope> list, String str7, String str8) {
        this.f7611c = i;
        this.f7612d = str;
        this.f7613e = str2;
        this.f7614f = str3;
        this.f7615w = str4;
        this.f7616x = uri;
        this.f7617y = str5;
        this.f7618z = j;
        this.f7606A = str6;
        this.f7607B = list;
        this.f7608C = str7;
        this.f7609D = str8;
    }

    /* renamed from: j0 */
    public static GoogleSignInAccount m32156j0(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l, String str7, Set<Scope> set) {
        long longValue = l.longValue();
        s.f(str7);
        s.j(set);
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, longValue, str7, new ArrayList(set), str5, str6);
    }

    /* renamed from: l0 */
    public static GoogleSignInAccount m32153l0(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        GoogleSignInAccount m32156j0 = m32156j0(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        m32156j0.f7617y = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return m32156j0;
    }

    /* renamed from: E */
    public String m32162E() {
        return this.f7613e;
    }

    /* renamed from: d0 */
    public Uri m32161d0() {
        return this.f7616x;
    }

    /* renamed from: e0 */
    public Set<Scope> m32160e0() {
        HashSet hashSet = new HashSet(this.f7607B);
        hashSet.addAll(this.f7610E);
        return hashSet;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof GoogleSignInAccount) {
            GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
            return googleSignInAccount.f7606A.equals(this.f7606A) && googleSignInAccount.m32160e0().equals(m32160e0());
        }
        return false;
    }

    /* renamed from: f */
    public Account m32159f() {
        String str = this.f7614f;
        if (str == null) {
            return null;
        }
        return new Account(str, "com.google");
    }

    /* renamed from: h */
    public String m32158h() {
        return this.f7615w;
    }

    /* renamed from: h0 */
    public String m32157h0() {
        return this.f7617y;
    }

    public int hashCode() {
        return ((this.f7606A.hashCode() + 527) * 31) + m32160e0().hashCode();
    }

    /* renamed from: k */
    public String m32155k() {
        return this.f7614f;
    }

    /* renamed from: l */
    public String m32154l() {
        return this.f7609D;
    }

    /* renamed from: s */
    public String m32152s() {
        return this.f7608C;
    }

    /* renamed from: u */
    public String m32151u() {
        return this.f7612d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31656j(parcel, 1, this.f7611c);
        C2917b.m31651o(parcel, 2, m32151u(), false);
        C2917b.m31651o(parcel, 3, m32162E(), false);
        C2917b.m31651o(parcel, 4, m32155k(), false);
        C2917b.m31651o(parcel, 5, m32158h(), false);
        C2917b.m31652n(parcel, 6, m32161d0(), i, false);
        C2917b.m31651o(parcel, 7, m32157h0(), false);
        C2917b.m31654l(parcel, 8, this.f7618z);
        C2917b.m31651o(parcel, 9, this.f7606A, false);
        C2917b.m31648r(parcel, 10, this.f7607B, false);
        C2917b.m31651o(parcel, 11, m32152s(), false);
        C2917b.m31651o(parcel, 12, m32154l(), false);
        C2917b.m31664b(parcel, m31665a);
    }
}
