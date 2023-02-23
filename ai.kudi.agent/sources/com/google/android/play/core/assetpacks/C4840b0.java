package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.google.android.play.core.internal.C4957a;
import com.google.android.play.core.internal.C5004x;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.b0 */
/* loaded from: classes2.dex */
public final class C4840b0 {

    /* renamed from: c */
    private static final C4957a f12258c = new C4957a("AssetPackStorage");

    /* renamed from: a */
    private final Context f12259a;

    /* renamed from: b */
    private final C4862f2 f12260b;

    static {
        TimeUnit.DAYS.toMillis(14L);
        TimeUnit.DAYS.toMillis(28L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4840b0(Context context, C4862f2 c4862f2) {
        this.f12259a = context;
        this.f12260b = c4862f2;
    }

    /* renamed from: B */
    private final File m26166B(String str) {
        return new File(m26161G(), str);
    }

    /* renamed from: C */
    private final File m26165C(String str, int i, long j) {
        return new File(m26148m(str, i, j), "merge.tmp");
    }

    /* renamed from: D */
    private final List<File> m26164D() {
        File[] listFiles;
        ArrayList arrayList = new ArrayList();
        try {
        } catch (IOException e) {
            f12258c.m25955e("Could not process directory while scanning installed packs. %s", e);
        }
        if (m26161G().exists() && m26161G().listFiles() != null) {
            for (File file : m26161G().listFiles()) {
                if (!file.getCanonicalPath().equals(m26163E().getCanonicalPath())) {
                    arrayList.add(file);
                }
            }
            return arrayList;
        }
        return arrayList;
    }

    /* renamed from: E */
    private final File m26163E() {
        return new File(m26161G(), "_tmp");
    }

    /* renamed from: F */
    private final File m26162F(String str, int i, long j) {
        return new File(new File(new File(m26163E(), str), String.valueOf(i)), String.valueOf(j));
    }

    /* renamed from: G */
    private final File m26161G() {
        return new File(this.f12259a.getFilesDir(), "assetpacks");
    }

    /* renamed from: a */
    private final File m26160a(String str, int i) {
        return new File(m26166B(str), String.valueOf(i));
    }

    /* renamed from: e */
    private static void m26156e(File file) {
        File[] listFiles;
        if (file.listFiles() == null || file.listFiles().length <= 1) {
            return;
        }
        long m26153h = m26153h(file);
        for (File file2 : file.listFiles()) {
            if (!file2.getName().equals(String.valueOf(m26153h)) && !file2.getName().equals("stale.tmp")) {
                m26144q(file2);
            }
        }
    }

    /* renamed from: h */
    private static long m26153h(File file) {
        File[] listFiles;
        if (file.exists()) {
            ArrayList arrayList = new ArrayList();
            try {
                for (File file2 : file.listFiles()) {
                    if (!file2.getName().equals("stale.tmp")) {
                        arrayList.add(Long.valueOf(file2.getName()));
                    }
                }
            } catch (NumberFormatException e) {
                f12258c.m25956d(e, "Corrupt asset pack directories.", new Object[0]);
            }
            if (arrayList.isEmpty()) {
                return -1L;
            }
            Collections.sort(arrayList);
            return ((Long) arrayList.get(arrayList.size() - 1)).longValue();
        }
        return -1L;
    }

    /* renamed from: q */
    private static boolean m26144q(File file) {
        boolean z;
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            z = true;
            for (File file2 : listFiles) {
                z &= m26144q(file2);
            }
        } else {
            z = true;
        }
        return file.delete() && true == z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public final void m26167A(String str, int i, long j) {
        if (m26162F(str, i, j).exists()) {
            m26144q(m26162F(str, i, j));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final File m26159b(String str, int i, long j) {
        return new File(m26160a(str, i), String.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final File m26158c(String str, int i, long j, String str2) {
        return new File(new File(new File(m26162F(str, i, j), "_slices"), "_unverified"), str2);
    }

    /* renamed from: d */
    final Map<String, AbstractC4834a> m26157d() {
        HashMap hashMap = new HashMap();
        try {
            for (File file : m26164D()) {
                AbstractC4834a m26152i = m26152i(file.getName());
                if (m26152i != null) {
                    hashMap.put(file.getName(), m26152i);
                }
            }
        } catch (IOException e) {
            f12258c.m25955e("Could not process directory while scanning installed packs: %s", e);
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final void m26155f(String str, int i, long j, int i2) throws IOException {
        File m26165C = m26165C(str, i, j);
        Properties properties = new Properties();
        properties.put("numberOfMerges", String.valueOf(i2));
        m26165C.getParentFile().mkdirs();
        m26165C.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(m26165C);
        properties.store(fileOutputStream, (String) null);
        fileOutputStream.close();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final void m26154g(List<String> list) {
        int m26122a = this.f12260b.m26122a();
        List<File> m26164D = m26164D();
        int size = m26164D.size();
        for (int i = 0; i < size; i++) {
            File file = m26164D.get(i);
            if (!list.contains(file.getName()) && m26153h(file) != m26122a) {
                m26144q(file);
            }
        }
    }

    /* renamed from: i */
    final AbstractC4834a m26152i(String str) throws IOException {
        String m26146o = m26146o(str);
        if (m26146o == null) {
            return null;
        }
        File file = new File(m26146o, "assets");
        if (file.isDirectory()) {
            return AbstractC4834a.m26172a(m26146o, file.getCanonicalPath());
        }
        f12258c.m25955e("Failed to find assets directory: %s", file);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public final File m26151j(String str, int i, long j) {
        return new File(m26159b(str, i, j), "_metadata");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public final File m26150k(String str, int i, long j, String str2) {
        return new File(new File(new File(m26162F(str, i, j), "_slices"), "_verified"), str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public final Map<String, Long> m26149l() {
        HashMap hashMap = new HashMap();
        for (String str : m26157d().keySet()) {
            hashMap.put(str, Long.valueOf(m26137x(str)));
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public final File m26148m(String str, int i, long j) {
        return new File(m26162F(str, i, j), "_packs");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public final File m26147n(String str, int i, long j, String str2) {
        return new File(m26136y(str, i, j, str2), "checkpoint.dat");
    }

    /* renamed from: o */
    final String m26146o(String str) throws IOException {
        int length;
        File file = new File(m26161G(), str);
        if (!file.exists()) {
            f12258c.m25957c("Pack not found with pack name: %s", str);
            return null;
        }
        File file2 = new File(file, String.valueOf(this.f12260b.m26122a()));
        if (!file2.exists()) {
            f12258c.m25957c("Pack not found with pack name: %s app version: %s", str, Integer.valueOf(this.f12260b.m26122a()));
            return null;
        }
        File[] listFiles = file2.listFiles();
        if (listFiles == null || (length = listFiles.length) == 0) {
            f12258c.m25957c("No pack version found for pack name: %s app version: %s", str, Integer.valueOf(this.f12260b.m26122a()));
            return null;
        } else if (length > 1) {
            f12258c.m25955e("Multiple pack versions found for pack name: %s app version: %s", str, Integer.valueOf(this.f12260b.m26122a()));
            return null;
        } else {
            return listFiles[0].getCanonicalPath();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public final void m26145p() {
        List<File> m26164D = m26164D();
        int size = m26164D.size();
        for (int i = 0; i < size; i++) {
            File file = m26164D.get(i);
            if (file.listFiles() != null) {
                m26156e(file);
                long m26153h = m26153h(file);
                if (this.f12260b.m26122a() != m26153h) {
                    try {
                        new File(new File(file, String.valueOf(m26153h)), "stale.tmp").createNewFile();
                    } catch (IOException unused) {
                        f12258c.m25955e("Could not write staleness marker.", new Object[0]);
                    }
                }
                for (File file2 : file.listFiles()) {
                    m26156e(file2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public final int m26143r(String str, int i, long j) throws IOException {
        File m26165C = m26165C(str, i, j);
        if (m26165C.exists()) {
            Properties properties = new Properties();
            FileInputStream fileInputStream = new FileInputStream(m26165C);
            try {
                properties.load(fileInputStream);
                fileInputStream.close();
                if (properties.getProperty("numberOfMerges") != null) {
                    try {
                        return Integer.parseInt(properties.getProperty("numberOfMerges"));
                    } catch (NumberFormatException e) {
                        throw new C4923t0("Merge checkpoint file corrupt.", e);
                    }
                }
                throw new C4923t0("Merge checkpoint file corrupt.");
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    C5004x.m25877a(th, th2);
                }
                throw th;
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public final File m26142s(String str, int i, long j, String str2) {
        return new File(m26136y(str, i, j, str2), "checkpoint_ext.dat");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public final boolean m26141t(String str) {
        if (m26166B(str).exists()) {
            return m26144q(m26166B(str));
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public final int m26140u(String str) {
        return (int) m26153h(m26166B(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public final File m26139v(String str, int i, long j) {
        return new File(new File(m26162F(str, i, j), "_slices"), "_metadata");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public final File m26138w(String str, int i, long j, String str2) {
        return new File(m26136y(str, i, j, str2), "slice.zip");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public final long m26137x(String str) {
        return m26153h(m26160a(str, m26140u(str)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public final File m26136y(String str, int i, long j, String str2) {
        return new File(m26139v(str, i, j), str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public final void m26135z() {
        m26144q(m26161G());
    }
}
