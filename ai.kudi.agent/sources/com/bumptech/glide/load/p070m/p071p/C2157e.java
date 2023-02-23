package com.bumptech.glide.load.p070m.p071p;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.C1997e;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.p069z.InterfaceC2095b;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
/* compiled from: ThumbnailStreamOpener.java */
/* renamed from: com.bumptech.glide.load.m.p.e */
/* loaded from: classes2.dex */
class C2157e {

    /* renamed from: f */
    private static final C2151a f6460f = new C2151a();

    /* renamed from: a */
    private final C2151a f6461a;

    /* renamed from: b */
    private final InterfaceC2156d f6462b;

    /* renamed from: c */
    private final InterfaceC2095b f6463c;

    /* renamed from: d */
    private final ContentResolver f6464d;

    /* renamed from: e */
    private final List<ImageHeaderParser> f6465e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2157e(List<ImageHeaderParser> list, InterfaceC2156d interfaceC2156d, InterfaceC2095b interfaceC2095b, ContentResolver contentResolver) {
        this(list, f6460f, interfaceC2156d, interfaceC2095b, contentResolver);
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x004a: MOVE  (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:28:0x004a */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004d  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String m33610b(android.net.Uri r7) {
        /*
            r6 = this;
            java.lang.String r0 = "ThumbStreamOpener"
            r1 = 0
            com.bumptech.glide.load.m.p.d r2 = r6.f6462b     // Catch: java.lang.Throwable -> L24 java.lang.SecurityException -> L26
            android.database.Cursor r2 = r2.mo33612a(r7)     // Catch: java.lang.Throwable -> L24 java.lang.SecurityException -> L26
            if (r2 == 0) goto L1e
            boolean r3 = r2.moveToFirst()     // Catch: java.lang.SecurityException -> L1c java.lang.Throwable -> L49
            if (r3 == 0) goto L1e
            r3 = 0
            java.lang.String r7 = r2.getString(r3)     // Catch: java.lang.SecurityException -> L1c java.lang.Throwable -> L49
            if (r2 == 0) goto L1b
            r2.close()
        L1b:
            return r7
        L1c:
            r3 = move-exception
            goto L28
        L1e:
            if (r2 == 0) goto L23
            r2.close()
        L23:
            return r1
        L24:
            r7 = move-exception
            goto L4b
        L26:
            r3 = move-exception
            r2 = r1
        L28:
            r4 = 3
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch: java.lang.Throwable -> L49
            if (r4 == 0) goto L43
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
            r4.<init>()     // Catch: java.lang.Throwable -> L49
            java.lang.String r5 = "Failed to query for thumbnail for Uri: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L49
            r4.append(r7)     // Catch: java.lang.Throwable -> L49
            java.lang.String r7 = r4.toString()     // Catch: java.lang.Throwable -> L49
            android.util.Log.d(r0, r7, r3)     // Catch: java.lang.Throwable -> L49
        L43:
            if (r2 == 0) goto L48
            r2.close()
        L48:
            return r1
        L49:
            r7 = move-exception
            r1 = r2
        L4b:
            if (r1 == 0) goto L50
            r1.close()
        L50:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p070m.p071p.C2157e.m33610b(android.net.Uri):java.lang.String");
    }

    /* renamed from: c */
    private boolean m33609c(File file) {
        return this.f6461a.m33624a(file) && 0 < this.f6461a.m33622c(file);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m33611a(Uri uri) {
        InputStream inputStream = null;
        try {
            try {
                inputStream = this.f6464d.openInputStream(uri);
                int m33950b = C1997e.m33950b(this.f6465e, inputStream, this.f6463c);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return m33950b;
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

    /* renamed from: d */
    public InputStream m33608d(Uri uri) throws FileNotFoundException {
        String m33610b = m33610b(uri);
        if (TextUtils.isEmpty(m33610b)) {
            return null;
        }
        File m33623b = this.f6461a.m33623b(m33610b);
        if (m33609c(m33623b)) {
            Uri fromFile = Uri.fromFile(m33623b);
            try {
                return this.f6464d.openInputStream(fromFile);
            } catch (NullPointerException e) {
                throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + fromFile).initCause(e));
            }
        }
        return null;
    }

    C2157e(List<ImageHeaderParser> list, C2151a c2151a, InterfaceC2156d interfaceC2156d, InterfaceC2095b interfaceC2095b, ContentResolver contentResolver) {
        this.f6461a = c2151a;
        this.f6462b = interfaceC2156d;
        this.f6463c = interfaceC2095b;
        this.f6464d = contentResolver;
        this.f6465e = list;
    }
}
