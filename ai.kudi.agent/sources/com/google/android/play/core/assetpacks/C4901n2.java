package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.C5004x;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
/* renamed from: com.google.android.play.core.assetpacks.n2 */
/* loaded from: classes2.dex */
final class C4901n2 {

    /* renamed from: a */
    private static final Pattern f12415a = Pattern.compile("[0-9]+-(NAM|LFH)\\.dat");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static List<File> m26058a(File file, File file2) throws IOException {
        File[] fileArr;
        ArrayList arrayList = new ArrayList();
        File[] listFiles = file2.listFiles(C4897m2.f12411a);
        if (listFiles == null) {
            fileArr = new File[0];
        } else {
            File[] fileArr2 = new File[listFiles.length];
            for (File file3 : listFiles) {
                int parseInt = Integer.parseInt(file3.getName().split("-")[0]);
                if (parseInt > listFiles.length || fileArr2[parseInt] != null) {
                    throw new C4923t0("Metadata folder ordering corrupt.");
                }
                fileArr2[parseInt] = file3;
            }
            fileArr = fileArr2;
        }
        for (File file4 : fileArr) {
            arrayList.add(file4);
            if (file4.getName().contains("LFH")) {
                FileInputStream fileInputStream = new FileInputStream(file4);
                try {
                    C4917r2 m26103g = new C4885k0(fileInputStream).m26103g();
                    if (m26103g.m26024d() == null) {
                        throw new C4923t0("Metadata files corrupt. Could not read local file header.");
                    }
                    File file5 = new File(file, m26103g.m26024d());
                    if (!file5.exists()) {
                        throw new C4923t0(String.format("Missing asset file %s during slice reconstruction.", file5.getCanonicalPath()));
                    }
                    arrayList.add(file5);
                    fileInputStream.close();
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        C5004x.m25877a(th, th2);
                    }
                    throw th;
                }
            }
        }
        return arrayList;
    }
}
