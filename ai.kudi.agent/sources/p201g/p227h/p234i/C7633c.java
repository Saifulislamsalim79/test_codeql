package p201g.p227h.p234i;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import androidx.core.content.p057e.C1347c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p201g.p227h.p234i.C7642f;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FontProvider.java */
/* renamed from: g.h.i.c */
/* loaded from: classes2.dex */
public class C7633c {

    /* renamed from: a */
    private static final Comparator<byte[]> f18313a = new C7634a();

    /* compiled from: FontProvider.java */
    /* renamed from: g.h.i.c$a */
    /* loaded from: classes2.dex */
    class C7634a implements Comparator<byte[]> {
        C7634a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(byte[] bArr, byte[] bArr2) {
            int i;
            int i2;
            if (bArr.length != bArr2.length) {
                i = bArr.length;
                i2 = bArr2.length;
            } else {
                for (int i3 = 0; i3 < bArr.length; i3++) {
                    if (bArr[i3] != bArr2[i3]) {
                        i = bArr[i3];
                        i2 = bArr2[i3];
                    }
                }
                return 0;
            }
            return i - i2;
        }
    }

    /* renamed from: a */
    private static List<byte[]> m17966a(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    /* renamed from: b */
    private static boolean m17965b(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    private static List<List<byte[]>> m17964c(C7635d c7635d, Resources resources) {
        if (c7635d.m17958b() != null) {
            return c7635d.m17958b();
        }
        return C1347c.m36273c(resources, c7635d.m17957c());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static C7642f.C7643a m17963d(Context context, C7635d c7635d, CancellationSignal cancellationSignal) throws PackageManager.NameNotFoundException {
        ProviderInfo m17962e = m17962e(context.getPackageManager(), c7635d, context.getResources());
        if (m17962e == null) {
            return C7642f.C7643a.m17941a(1, null);
        }
        return C7642f.C7643a.m17941a(0, m17961f(context, c7635d, m17962e.authority, cancellationSignal));
    }

    /* renamed from: e */
    static ProviderInfo m17962e(PackageManager packageManager, C7635d c7635d, Resources resources) throws PackageManager.NameNotFoundException {
        String m17955e = c7635d.m17955e();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(m17955e, 0);
        if (resolveContentProvider != null) {
            if (resolveContentProvider.packageName.equals(c7635d.m17954f())) {
                List<byte[]> m17966a = m17966a(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
                Collections.sort(m17966a, f18313a);
                List<List<byte[]>> m17964c = m17964c(c7635d, resources);
                for (int i = 0; i < m17964c.size(); i++) {
                    ArrayList arrayList = new ArrayList(m17964c.get(i));
                    Collections.sort(arrayList, f18313a);
                    if (m17965b(m17966a, arrayList)) {
                        return resolveContentProvider;
                    }
                }
                return null;
            }
            throw new PackageManager.NameNotFoundException("Found content provider " + m17955e + ", but package was not " + c7635d.m17954f());
        }
        throw new PackageManager.NameNotFoundException("No package found for authority: " + m17955e);
    }

    /* renamed from: f */
    static C7642f.C7644b[] m17961f(Context context, C7635d c7635d, String str, CancellationSignal cancellationSignal) {
        int i;
        Uri withAppendedId;
        ArrayList arrayList = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
        Cursor cursor = null;
        try {
            String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
            if (Build.VERSION.SDK_INT > 16) {
                cursor = context.getContentResolver().query(build, strArr, "query = ?", new String[]{c7635d.m17953g()}, null, cancellationSignal);
            } else {
                cursor = context.getContentResolver().query(build, strArr, "query = ?", new String[]{c7635d.m17953g()}, null);
            }
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex("_id");
                int columnIndex3 = cursor.getColumnIndex("file_id");
                int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor.getColumnIndex("font_weight");
                int columnIndex6 = cursor.getColumnIndex("font_italic");
                while (cursor.moveToNext()) {
                    int i2 = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                    int i3 = columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0;
                    if (columnIndex3 == -1) {
                        i = i2;
                        withAppendedId = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                    } else {
                        i = i2;
                        withAppendedId = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                    }
                    arrayList2.add(C7642f.C7644b.m17938a(withAppendedId, i3, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, i));
                }
                arrayList = arrayList2;
            }
            return (C7642f.C7644b[]) arrayList.toArray(new C7642f.C7644b[0]);
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }
}
