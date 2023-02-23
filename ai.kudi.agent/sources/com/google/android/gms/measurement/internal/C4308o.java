package com.google.android.gms.measurement.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import androidx.core.content.C1335a;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.o */
/* loaded from: classes2.dex */
public final class C4308o extends w5 {

    /* renamed from: c */
    private long f10537c;

    /* renamed from: d */
    private String f10538d;

    /* renamed from: e */
    private AccountManager f10539e;

    /* renamed from: f */
    private Boolean f10540f;

    /* renamed from: g */
    private long f10541g;

    C4308o(b5 b5Var) {
        super(b5Var);
    }

    /* renamed from: j */
    protected final boolean m28020j() {
        Calendar calendar = Calendar.getInstance();
        this.f10537c = TimeUnit.MINUTES.convert(calendar.get(15) + calendar.get(16), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String lowerCase = locale.getLanguage().toLowerCase(Locale.ENGLISH);
        String lowerCase2 = locale.getCountry().toLowerCase(Locale.ENGLISH);
        StringBuilder sb = new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length());
        sb.append(lowerCase);
        sb.append("-");
        sb.append(lowerCase2);
        this.f10538d = sb.toString();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public final long m28019o() {
        h();
        return this.f10541g;
    }

    /* renamed from: p */
    public final long m28018p() {
        k();
        return this.f10537c;
    }

    /* renamed from: q */
    public final String m28017q() {
        k();
        return this.f10538d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public final void m28016r() {
        h();
        this.f10540f = null;
        this.f10541g = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public final boolean m28015s() {
        Account[] result;
        h();
        long currentTimeMillis = ((v5) this).a.c().currentTimeMillis();
        if (currentTimeMillis - this.f10541g > 86400000) {
            this.f10540f = null;
        }
        Boolean bool = this.f10540f;
        if (bool == null) {
            if (C1335a.m36327a(((v5) this).a.f(), "android.permission.GET_ACCOUNTS") != 0) {
                ((v5) this).a.b().y().m28014a("Permission error checking for dasher/unicorn accounts");
                this.f10541g = currentTimeMillis;
                this.f10540f = Boolean.FALSE;
                return false;
            }
            if (this.f10539e == null) {
                this.f10539e = AccountManager.get(((v5) this).a.f());
            }
            try {
                result = this.f10539e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, null, null).getResult();
            } catch (AuthenticatorException | OperationCanceledException | IOException e) {
                ((v5) this).a.b().t().m28013b("Exception checking account types", e);
            }
            if (result != null && result.length > 0) {
                this.f10540f = Boolean.TRUE;
                this.f10541g = currentTimeMillis;
                return true;
            }
            Account[] result2 = this.f10539e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, null, null).getResult();
            if (result2 != null && result2.length > 0) {
                this.f10540f = Boolean.TRUE;
                this.f10541g = currentTimeMillis;
                return true;
            }
            this.f10541g = currentTimeMillis;
            this.f10540f = Boolean.FALSE;
            return false;
        }
        return bool.booleanValue();
    }
}
