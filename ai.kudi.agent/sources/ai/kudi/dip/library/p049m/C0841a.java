package ai.kudi.dip.library.p049m;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import java.io.File;
import java.util.List;
import kotlin.e0.d.l;
import kotlin.p549l0.C13262h;
import kotlin.p549l0.C13276s;
import kotlin.p549l0.C13277t;
/* compiled from: URIPathUtil.kt */
/* renamed from: ai.kudi.dip.library.m.a */
/* loaded from: classes2.dex */
public final class C0841a {
    /* renamed from: a */
    public final String m37891a(Context context, Uri uri, String str, String[] strArr) {
        l.f(context, "context");
        String[] strArr2 = {"_data"};
        Cursor cursor = null;
        if (uri == null) {
            return null;
        }
        try {
            Cursor query = context.getContentResolver().query(uri, strArr2, str, strArr, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        String string = query.getString(query.getColumnIndexOrThrow("_data"));
                        query.close();
                        return string;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = query;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (query != null) {
                query.close();
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: b */
    public final String m37890b(Context context, Uri uri) {
        l.f(context, "context");
        String[] strArr = {"_display_name"};
        Cursor cursor = null;
        if (uri == null) {
            return null;
        }
        try {
            Cursor query = context.getContentResolver().query(uri, strArr, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        String string = query.getString(query.getColumnIndexOrThrow("_display_name"));
                        query.close();
                        return string;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = query;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (query != null) {
                query.close();
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: c */
    public final String m37889c(Context context, Uri uri) {
        boolean m5442s;
        boolean m5442s2;
        List m5383r0;
        boolean m5447E;
        boolean m5447E2;
        List m5383r02;
        boolean m5442s3;
        String m5451A;
        l.f(context, "context");
        l.f(uri, "uri");
        Uri uri2 = null;
        if (DocumentsContract.isDocumentUri(context, uri)) {
            if (m37887e(uri)) {
                String documentId = DocumentsContract.getDocumentId(uri);
                l.e(documentId, "docId");
                m5383r02 = C13277t.m5383r0(documentId, new String[]{":"}, false, 0, 6, null);
                Object[] array = m5383r02.toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    m5442s3 = C13276s.m5442s("primary", strArr[0], true);
                    if (m5442s3) {
                        if (strArr.length > 1) {
                            return Environment.getExternalStorageDirectory().toString() + '/' + strArr[1];
                        }
                        return l.m(Environment.getExternalStorageDirectory().toString(), "/");
                    }
                    m5451A = C13276s.m5451A(documentId, ":", "/", false, 4, null);
                    return l.m("storage/", m5451A);
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            } else if (m37888d(uri)) {
                String m37890b = m37890b(context, uri);
                if (m37890b != null) {
                    return Environment.getExternalStorageDirectory().toString() + "/Download/" + ((Object) m37890b);
                }
                String documentId2 = DocumentsContract.getDocumentId(uri);
                l.e(documentId2, "id");
                m5447E2 = C13276s.m5447E(documentId2, "raw:", false, 2, null);
                if (m5447E2) {
                    l.e(documentId2, "id");
                    documentId2 = new C13262h("raw:").m5520g(documentId2, "");
                    if (new File(documentId2).exists()) {
                        return documentId2;
                    }
                }
                Uri parse = Uri.parse("content://downloads/public_downloads");
                Long valueOf = Long.valueOf(documentId2);
                l.e(valueOf, "valueOf(id)");
                return m37891a(context, ContentUris.withAppendedId(parse, valueOf.longValue()), null, null);
            } else if (m37885g(uri)) {
                String documentId3 = DocumentsContract.getDocumentId(uri);
                l.e(documentId3, "docId");
                m5383r0 = C13277t.m5383r0(documentId3, new String[]{":"}, false, 0, 6, null);
                Object[] array2 = m5383r0.toArray(new String[0]);
                if (array2 != null) {
                    String[] strArr2 = (String[]) array2;
                    String str = strArr2[0];
                    switch (str.hashCode()) {
                        case 93166550:
                            if (str.equals("audio")) {
                                uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                                break;
                            }
                            break;
                        case 100313435:
                            if (str.equals("image")) {
                                uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                                break;
                            }
                            break;
                        case 112202875:
                            if (str.equals("video")) {
                                uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                                break;
                            }
                            break;
                        case 861720859:
                            if (str.equals("document")) {
                                String m37890b2 = m37890b(context, uri);
                                if (m37890b2 != null) {
                                    return Environment.getExternalStorageDirectory().toString() + "/Download/" + ((Object) m37890b2);
                                }
                                String documentId4 = DocumentsContract.getDocumentId(uri);
                                l.e(documentId4, "id");
                                m5447E = C13276s.m5447E(documentId4, "raw:", false, 2, null);
                                if (m5447E) {
                                    l.e(documentId4, "id");
                                    documentId4 = new C13262h("raw:").m5520g(documentId4, "");
                                    if (new File(documentId4).exists()) {
                                        return documentId4;
                                    }
                                }
                                Uri parse2 = Uri.parse("content://downloads/public_downloads");
                                Long valueOf2 = Long.valueOf(documentId4);
                                l.e(valueOf2, "valueOf(id)");
                                return m37891a(context, ContentUris.withAppendedId(parse2, valueOf2.longValue()), null, null);
                            }
                            break;
                    }
                    return m37891a(context, uri2, "_id=?", new String[]{strArr2[1]});
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        } else {
            m5442s = C13276s.m5442s("content", uri.getScheme(), true);
            if (m5442s) {
                return m37886f(uri) ? uri.getLastPathSegment() : m37891a(context, uri, null, null);
            }
            m5442s2 = C13276s.m5442s("file", uri.getScheme(), true);
            if (m5442s2) {
                return uri.getPath();
            }
        }
        return uri.getEncodedPath();
    }

    /* renamed from: d */
    public final boolean m37888d(Uri uri) {
        l.f(uri, "uri");
        return l.b("com.android.providers.downloads.documents", uri.getAuthority());
    }

    /* renamed from: e */
    public final boolean m37887e(Uri uri) {
        l.f(uri, "uri");
        return l.b("com.android.externalstorage.documents", uri.getAuthority());
    }

    /* renamed from: f */
    public final boolean m37886f(Uri uri) {
        l.f(uri, "uri");
        return l.b("com.google.android.apps.photos.content", uri.getAuthority());
    }

    /* renamed from: g */
    public final boolean m37885g(Uri uri) {
        l.f(uri, "uri");
        return l.b("com.android.providers.media.documents", uri.getAuthority());
    }
}
