package pl.droidsonroids.relinker;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import pl.droidsonroids.relinker.C14761b;
/* compiled from: ApkLibraryInstaller.java */
/* renamed from: pl.droidsonroids.relinker.a */
/* loaded from: classes3.dex */
public class C14759a implements C14761b.InterfaceC14762a {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ApkLibraryInstaller.java */
    /* renamed from: pl.droidsonroids.relinker.a$a */
    /* loaded from: classes3.dex */
    public static class C14760a {

        /* renamed from: a */
        public ZipFile f33018a;

        /* renamed from: b */
        public ZipEntry f33019b;

        public C14760a(ZipFile zipFile, ZipEntry zipEntry) {
            this.f33018a = zipFile;
            this.f33019b = zipEntry;
        }
    }

    /* renamed from: b */
    private void m389b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: c */
    private long m388c(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                outputStream.flush();
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += read;
        }
    }

    /* renamed from: d */
    private C14760a m387d(Context context, String[] strArr, String str, C14766c c14766c) {
        String[] m385f = m385f(context);
        int length = m385f.length;
        char c = 0;
        int i = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i >= length) {
                return null;
            }
            String str2 = m385f[i];
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i2 = i3;
                }
            }
            if (zipFile != null) {
                int i4 = 0;
                while (true) {
                    int i5 = i4 + 1;
                    if (i4 < 5) {
                        int length2 = strArr.length;
                        int i6 = 0;
                        while (i6 < length2) {
                            String str3 = "lib" + File.separatorChar + strArr[i6] + File.separatorChar + str;
                            Object[] objArr = new Object[2];
                            objArr[c] = str3;
                            objArr[1] = str2;
                            c14766c.m370i("Looking for %s in APK %s...", objArr);
                            ZipEntry entry = zipFile.getEntry(str3);
                            if (entry != null) {
                                return new C14760a(zipFile, entry);
                            }
                            i6++;
                            c = 0;
                        }
                        i4 = i5;
                        c = 0;
                    } else {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i++;
            c = 0;
        }
    }

    /* renamed from: e */
    private String[] m386e(Context context, String str) {
        Pattern compile = Pattern.compile("lib" + File.separatorChar + "([^\\" + File.separatorChar + "]*)" + File.separatorChar + str);
        HashSet hashSet = new HashSet();
        for (String str2 : m385f(context)) {
            try {
                Enumeration<? extends ZipEntry> entries = new ZipFile(new File(str2), 1).entries();
                while (entries.hasMoreElements()) {
                    Matcher matcher = compile.matcher(entries.nextElement().getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException unused) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    /* renamed from: f */
    private String[] m385f(Context context) {
        String[] strArr;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (Build.VERSION.SDK_INT < 21 || (strArr = applicationInfo.splitSourceDirs) == null || strArr.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = applicationInfo.sourceDir;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }

    @Override // pl.droidsonroids.relinker.C14761b.InterfaceC14762a
    /* renamed from: a */
    public void mo382a(Context context, String[] strArr, String str, File file, C14766c c14766c) {
        C14760a m387d;
        String[] strArr2;
        Closeable closeable;
        InputStream inputStream;
        long m388c;
        C14760a c14760a = null;
        Closeable closeable2 = null;
        try {
            m387d = m387d(context, strArr, str, c14766c);
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (m387d == null) {
                try {
                    strArr2 = m386e(context, str);
                } catch (Exception e) {
                    strArr2 = new String[]{e.toString()};
                }
                throw new MissingLibraryException(str, strArr, strArr2);
            }
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (i < 5) {
                    c14766c.m370i("Found %s! Extracting...", str);
                    try {
                        if (file.exists() || file.createNewFile()) {
                            try {
                                inputStream = m387d.f33018a.getInputStream(m387d.f33019b);
                                try {
                                    closeable = new FileOutputStream(file);
                                } catch (FileNotFoundException unused) {
                                    closeable = null;
                                } catch (IOException unused2) {
                                    closeable = null;
                                } catch (Throwable th2) {
                                    th = th2;
                                    closeable = null;
                                }
                                try {
                                    m388c = m388c(inputStream, closeable);
                                    closeable.getFD().sync();
                                } catch (FileNotFoundException unused3) {
                                    m389b(inputStream);
                                    m389b(closeable);
                                    i = i2;
                                } catch (IOException unused4) {
                                    m389b(inputStream);
                                    m389b(closeable);
                                    i = i2;
                                } catch (Throwable th3) {
                                    th = th3;
                                    closeable2 = inputStream;
                                    m389b(closeable2);
                                    m389b(closeable);
                                    throw th;
                                }
                            } catch (FileNotFoundException unused5) {
                                inputStream = null;
                                closeable = null;
                            } catch (IOException unused6) {
                                inputStream = null;
                                closeable = null;
                            } catch (Throwable th4) {
                                th = th4;
                                closeable = null;
                            }
                            if (m388c != file.length()) {
                                m389b(inputStream);
                                m389b(closeable);
                            } else {
                                m389b(inputStream);
                                m389b(closeable);
                                file.setReadable(true, false);
                                file.setExecutable(true, false);
                                file.setWritable(true);
                                if (m387d != null) {
                                    try {
                                        if (m387d.f33018a != null) {
                                            m387d.f33018a.close();
                                            return;
                                        }
                                        return;
                                    } catch (IOException unused7) {
                                        return;
                                    }
                                }
                                return;
                            }
                        }
                    } catch (IOException unused8) {
                    }
                    i = i2;
                } else {
                    c14766c.m371h("FATAL! Couldn't extract the library from the APK!");
                    if (m387d != null) {
                        try {
                            if (m387d.f33018a != null) {
                                m387d.f33018a.close();
                                return;
                            }
                            return;
                        } catch (IOException unused9) {
                            return;
                        }
                    }
                    return;
                }
            }
        } catch (Throwable th5) {
            th = th5;
            c14760a = m387d;
            if (c14760a != null) {
                try {
                    if (c14760a.f33018a != null) {
                        c14760a.f33018a.close();
                    }
                } catch (IOException unused10) {
                }
            }
            throw th;
        }
    }
}
