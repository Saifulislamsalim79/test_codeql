package p201g.p262t.p263a;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.List;
/* compiled from: SupportSQLiteCompat.java */
/* renamed from: g.t.a.f */
/* loaded from: classes2.dex */
public final class C8092f {
    /* renamed from: a */
    public static List<Uri> m16769a(Cursor cursor) {
        return cursor.getNotificationUris();
    }

    /* renamed from: b */
    public static void m16768b(Cursor cursor, ContentResolver contentResolver, List<Uri> list) {
        cursor.setNotificationUris(contentResolver, list);
    }
}
