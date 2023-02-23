package com.google.firebase.perf.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.s;
import com.google.firebase.perf.C6591d;
import com.google.firebase.perf.config.C6569d;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.p172f.C6593a;
import com.google.firebase.perf.p178j.C6624a;
import com.google.firebase.perf.p178j.C6637h;
import com.google.firebase.perf.p179k.EnumC6652d;
import com.google.firebase.perf.session.SessionManager;
@Keep
/* loaded from: classes2.dex */
public class FirebasePerfProvider extends ContentProvider {
    private static final C6637h APP_START_TIME = new C6624a().m21415a();
    static final String EMPTY_APPLICATION_ID_PROVIDER_AUTHORITY = "com.google.firebase.firebaseperfprovider";
    private final Handler mainHandler = new Handler(Looper.getMainLooper());

    private static void checkContentProviderAuthority(ProviderInfo providerInfo) {
        s.k(providerInfo, "FirebasePerfProvider ProviderInfo cannot be null.");
        if (EMPTY_APPLICATION_ID_PROVIDER_AUTHORITY.equals(providerInfo.authority)) {
            throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        }
    }

    public static C6637h getAppStartTime() {
        return APP_START_TIME;
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        checkContentProviderAuthority(providerInfo);
        super.attachInfo(context, providerInfo);
        C6569d.m21605f().m21612N(getContext());
        C6593a m21528b = C6593a.m21528b();
        m21528b.m21521i(getContext());
        m21528b.m21520j(new C6591d());
        AppStartTrace m21134c = AppStartTrace.m21134c();
        m21134c.m21132e(getContext());
        this.mainHandler.post(new AppStartTrace.RunnableC6691a(m21134c));
        SessionManager.getInstance().updatePerfSession(EnumC6652d.FOREGROUND);
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return false;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
