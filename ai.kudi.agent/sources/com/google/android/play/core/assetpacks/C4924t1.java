package com.google.android.play.core.assetpacks;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.play.core.common.LocalTestingException;
import com.google.android.play.core.internal.C4957a;
import com.google.android.play.core.internal.C4966c0;
import com.google.android.play.core.internal.C4985m;
import com.google.android.play.core.internal.InterfaceC5005y;
import com.google.android.play.core.tasks.AbstractC5011c;
import com.google.android.play.core.tasks.C5013e;
import com.google.android.play.core.tasks.C5021m;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.t1 */
/* loaded from: classes2.dex */
public final class C4924t1 implements InterfaceC4883j3 {

    /* renamed from: g */
    private static final C4957a f12508g = new C4957a("FakeAssetPackService");

    /* renamed from: a */
    private final String f12509a;

    /* renamed from: b */
    private final C4930v f12510b;

    /* renamed from: c */
    private final Context f12511c;

    /* renamed from: d */
    private final C4862f2 f12512d;

    /* renamed from: e */
    private final InterfaceC5005y<Executor> f12513e;

    /* renamed from: f */
    private final Handler f12514f = new Handler(Looper.getMainLooper());

    static {
        new AtomicInteger(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4924t1(File file, C4930v c4930v, C4939x0 c4939x0, Context context, C4862f2 c4862f2, InterfaceC5005y<Executor> interfaceC5005y) {
        this.f12509a = file.getAbsolutePath();
        this.f12510b = c4930v;
        this.f12511c = context;
        this.f12512d = c4862f2;
        this.f12513e = interfaceC5005y;
    }

    /* renamed from: e */
    static long m26012e(int i, long j) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return j;
            }
            return 0L;
        }
        return j / 2;
    }

    /* renamed from: f */
    private static String m26011f(File file) throws LocalTestingException {
        try {
            return C4932v1.m25998b(Arrays.asList(file));
        } catch (IOException e) {
            throw new LocalTestingException(String.format("Could not digest file: %s.", file), e);
        } catch (NoSuchAlgorithmException e2) {
            throw new LocalTestingException("SHA256 algorithm not supported.", e2);
        }
    }

    /* renamed from: g */
    private final void m26010g(int i, String str, int i2) throws LocalTestingException {
        Bundle bundle = new Bundle();
        bundle.putInt("app_version_code", this.f12512d.m26122a());
        bundle.putInt("session_id", i);
        File[] m26006k = m26006k(str);
        ArrayList<String> arrayList = new ArrayList<>();
        long j = 0;
        for (File file : m26006k) {
            j += file.length();
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
            arrayList2.add(i2 == 3 ? new Intent().setData(Uri.EMPTY) : null);
            String m25921a = C4985m.m25921a(file);
            bundle.putParcelableArrayList(C4966c0.m25948b("chunk_intents", str, m25921a), arrayList2);
            bundle.putString(C4966c0.m25948b("uncompressed_hash_sha256", str, m25921a), m26011f(file));
            bundle.putLong(C4966c0.m25948b("uncompressed_size", str, m25921a), file.length());
            arrayList.add(m25921a);
        }
        bundle.putStringArrayList(C4966c0.m25949a("slice_ids", str), arrayList);
        bundle.putLong(C4966c0.m25949a("pack_version", str), this.f12512d.m26122a());
        bundle.putInt(C4966c0.m25949a(TransactionField.STATUS, str), i2);
        bundle.putInt(C4966c0.m25949a("error_code", str), 0);
        bundle.putLong(C4966c0.m25949a("bytes_downloaded", str), m26012e(i2, j));
        bundle.putLong(C4966c0.m25949a("total_bytes_to_download", str), j);
        bundle.putStringArrayList("pack_names", new ArrayList<>(Arrays.asList(str)));
        bundle.putLong("bytes_downloaded", m26012e(i2, j));
        bundle.putLong("total_bytes_to_download", j);
        final Intent putExtra = new Intent("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE").putExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE", bundle);
        this.f12514f.post(new Runnable(this, putExtra) { // from class: com.google.android.play.core.assetpacks.s1

            /* renamed from: c */
            private final C4924t1 f12501c;

            /* renamed from: d */
            private final Intent f12502d;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f12501c = this;
                this.f12502d = putExtra;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f12501c.m26009h(this.f12502d);
            }
        });
    }

    /* renamed from: k */
    private final File[] m26006k(final String str) throws LocalTestingException {
        File file = new File(this.f12509a);
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles(new FilenameFilter(str) { // from class: com.google.android.play.core.assetpacks.r1

                /* renamed from: a */
                private final String f12488a;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.f12488a = str;
                }

                @Override // java.io.FilenameFilter
                public final boolean accept(File file2, String str2) {
                    return str2.startsWith(String.valueOf(this.f12488a).concat("-")) && str2.endsWith(".apk");
                }
            });
            if (listFiles != null) {
                if (listFiles.length != 0) {
                    for (File file2 : listFiles) {
                        if (C4985m.m25921a(file2).equals(str)) {
                            return listFiles;
                        }
                    }
                    throw new LocalTestingException(String.format("No master slice available for pack '%s'.", str));
                }
                throw new LocalTestingException(String.format("No APKs available for pack '%s'.", str));
            }
            throw new LocalTestingException(String.format("Failed fetching APKs for pack '%s'.", str));
        }
        throw new LocalTestingException(String.format("Local testing directory '%s' not found.", file));
    }

    @Override // com.google.android.play.core.assetpacks.InterfaceC4883j3
    /* renamed from: a */
    public final AbstractC5011c<List<String>> mo26016a(Map<String, Long> map) {
        f12508g.m25954f("syncPacks()", new Object[0]);
        return C5013e.m25870b(new ArrayList());
    }

    @Override // com.google.android.play.core.assetpacks.InterfaceC4883j3
    /* renamed from: a */
    public final void mo26018a() {
        f12508g.m25954f("keepAlive", new Object[0]);
    }

    @Override // com.google.android.play.core.assetpacks.InterfaceC4883j3
    /* renamed from: a */
    public final void mo26017a(List<String> list) {
        f12508g.m25954f("cancelDownload(%s)", list);
    }

    @Override // com.google.android.play.core.assetpacks.InterfaceC4883j3
    /* renamed from: b */
    public final void mo26015b(final int i, final String str) {
        f12508g.m25954f("notifyModuleCompleted", new Object[0]);
        this.f12513e.m25876a().execute(new Runnable(this, i, str) { // from class: com.google.android.play.core.assetpacks.q1

            /* renamed from: c */
            private final C4924t1 f12476c;

            /* renamed from: d */
            private final int f12477d;

            /* renamed from: e */
            private final String f12478e;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f12476c = this;
                this.f12477d = i;
                this.f12478e = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f12476c.m26008i(this.f12477d, this.f12478e);
            }
        });
    }

    @Override // com.google.android.play.core.assetpacks.InterfaceC4883j3
    /* renamed from: c */
    public final AbstractC5011c<ParcelFileDescriptor> mo26014c(int i, String str, String str2, int i2) {
        File[] m26006k;
        int i3;
        f12508g.m25954f("getChunkFileDescriptor(session=%d, %s, %s, %d)", Integer.valueOf(i), str, str2, Integer.valueOf(i2));
        C5021m c5021m = new C5021m();
        try {
        } catch (LocalTestingException e) {
            f12508g.m25953g("getChunkFileDescriptor failed", e);
            c5021m.m25858b(e);
        } catch (FileNotFoundException e2) {
            f12508g.m25953g("getChunkFileDescriptor failed", e2);
            c5021m.m25858b(new LocalTestingException("Asset Slice file not found.", e2));
        }
        for (File file : m26006k(str)) {
            if (C4985m.m25921a(file).equals(str2)) {
                c5021m.m25857c(ParcelFileDescriptor.open(file, 268435456));
                return c5021m.m25859a();
            }
        }
        throw new LocalTestingException(String.format("Local testing slice for '%s' not found.", str2));
    }

    @Override // com.google.android.play.core.assetpacks.InterfaceC4883j3
    /* renamed from: d */
    public final void mo26013d(int i, String str, String str2, int i2) {
        f12508g.m25954f("notifyChunkTransferred", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ void m26009h(Intent intent) {
        this.f12510b.mo14975a(this.f12511c, intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public final /* synthetic */ void m26008i(int i, String str) {
        try {
            m26010g(i, str, 4);
        } catch (LocalTestingException e) {
            f12508g.m25953g("notifyModuleCompleted failed", e);
        }
    }

    @Override // com.google.android.play.core.assetpacks.InterfaceC4883j3
    /* renamed from: j */
    public final void mo26007j(int i) {
        f12508g.m25954f("notifySessionFailed", new Object[0]);
    }
}
