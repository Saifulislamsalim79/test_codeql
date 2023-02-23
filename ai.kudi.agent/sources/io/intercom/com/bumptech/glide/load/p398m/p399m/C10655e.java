package io.intercom.com.bumptech.glide.load.p398m.p399m;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import io.intercom.com.bumptech.glide.load.C10621f;
import io.intercom.com.bumptech.glide.load.InterfaceC10511e;
import io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10576b;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
/* compiled from: ThumbnailStreamOpener.java */
/* renamed from: io.intercom.com.bumptech.glide.load.m.m.e */
/* loaded from: classes3.dex */
class C10655e {

    /* renamed from: f */
    private static final C10649a f24456f = new C10649a();

    /* renamed from: a */
    private final C10649a f24457a;

    /* renamed from: b */
    private final InterfaceC10654d f24458b;

    /* renamed from: c */
    private final InterfaceC10576b f24459c;

    /* renamed from: d */
    private final ContentResolver f24460d;

    /* renamed from: e */
    private final List<InterfaceC10511e> f24461e;

    public C10655e(List<InterfaceC10511e> list, InterfaceC10654d interfaceC10654d, InterfaceC10576b interfaceC10576b, ContentResolver contentResolver) {
        this(list, f24456f, interfaceC10654d, interfaceC10576b, contentResolver);
    }

    /* renamed from: a */
    public int m12555a(Uri uri) {
        InputStream inputStream = null;
        try {
            try {
                inputStream = this.f24460d.openInputStream(uri);
                int m12603a = C10621f.m12603a(this.f24461e, inputStream, this.f24459c);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return m12603a;
            } catch (Throwable th) {
                if (0 != 0) {
                    try {
                        inputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (IOException | NullPointerException e) {
            if (Log.isLoggable("ThumbStreamOpener", 3)) {
                Log.d("ThumbStreamOpener", "Failed to open uri: " + uri, e);
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                    return -1;
                } catch (IOException unused3) {
                    return -1;
                }
            }
            return -1;
        }
    }

    /* renamed from: b */
    public InputStream m12554b(Uri uri) throws FileNotFoundException {
        Cursor mo12556a = this.f24458b.mo12556a(uri);
        if (mo12556a != null) {
            try {
                if (mo12556a.moveToFirst()) {
                    String string = mo12556a.getString(0);
                    if (TextUtils.isEmpty(string)) {
                        if (mo12556a != null) {
                            mo12556a.close();
                        }
                        return null;
                    }
                    File m12567b = this.f24457a.m12567b(string);
                    Uri fromFile = (!this.f24457a.m12568a(m12567b) || this.f24457a.m12566c(m12567b) <= 0) ? null : Uri.fromFile(m12567b);
                    if (mo12556a != null) {
                        mo12556a.close();
                    }
                    if (fromFile != null) {
                        try {
                            return this.f24460d.openInputStream(fromFile);
                        } catch (NullPointerException e) {
                            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + fromFile).initCause(e));
                        }
                    }
                    return null;
                }
            } finally {
                if (mo12556a != null) {
                    mo12556a.close();
                }
            }
        }
        return null;
    }

    public C10655e(List<InterfaceC10511e> list, C10649a c10649a, InterfaceC10654d interfaceC10654d, InterfaceC10576b interfaceC10576b, ContentResolver contentResolver) {
        this.f24457a = c10649a;
        this.f24458b = interfaceC10654d;
        this.f24459c = interfaceC10576b;
        this.f24460d = contentResolver;
        this.f24461e = list;
    }
}
