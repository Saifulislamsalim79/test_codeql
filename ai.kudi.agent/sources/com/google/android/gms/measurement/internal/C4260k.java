package com.google.android.gms.measurement.internal;

import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C3710ad;
import com.google.android.gms.internal.measurement.C3765e4;
import com.google.android.gms.internal.measurement.C3779f4;
import com.google.android.gms.internal.measurement.C3922o4;
import com.google.android.gms.internal.measurement.C3937p4;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.k */
/* loaded from: classes2.dex */
public final class C4260k extends AbstractC4353r9 {

    /* renamed from: f */
    private static final String[] f10409f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* renamed from: g */
    private static final String[] f10410g = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* renamed from: h */
    private static final String[] f10411h = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;"};

    /* renamed from: i */
    private static final String[] f10412i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* renamed from: j */
    private static final String[] f10413j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* renamed from: k */
    private static final String[] f10414k = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: l */
    private static final String[] f10415l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: m */
    private static final String[] f10416m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: d */
    private final C4248j f10417d;

    /* renamed from: e */
    private final C4306n9 f10418e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4260k(C4168ba c4168ba) {
        super(c4168ba);
        this.f10418e = new C4306n9(((v5) this).a.c());
        ((v5) this).a.z();
        this.f10417d = new C4248j(this, ((v5) this).a.f(), "google_app_measurement.db");
    }

    /* renamed from: J */
    static final void m28097J(ContentValues contentValues, String str, Object obj) {
        com.google.android.gms.common.internal.s.f("value");
        com.google.android.gms.common.internal.s.j(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put("value", (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    /* renamed from: L */
    private final long m28095L(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = m28089R().rawQuery(str, strArr);
                if (rawQuery.moveToFirst()) {
                    long j = rawQuery.getLong(0);
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    return j;
                }
                throw new SQLiteException("Database returned empty set");
            } catch (SQLiteException e) {
                ((v5) this).a.b().r().m28012c("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: M */
    private final long m28094M(String str, String[] strArr, long j) {
        Cursor cursor = null;
        try {
            try {
                cursor = m28089R().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    return cursor.getLong(0);
                }
                if (cursor != null) {
                    cursor.close();
                }
                return j;
            } catch (SQLiteException e) {
                ((v5) this).a.b().r().m28012c("Database error", str, e);
                throw e;
            }
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0241: MOVE  (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:108:0x0241 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean] */
    /* renamed from: I */
    public final void m28098I(String str, long j, long j2, C4157aa c4157aa) {
        ?? r4;
        Cursor cursor;
        String str2;
        Cursor rawQuery;
        String string;
        String str3;
        String[] strArr;
        com.google.android.gms.common.internal.s.j(c4157aa);
        h();
        m27986i();
        Cursor cursor2 = null;
        r3 = null;
        r3 = null;
        String str4 = null;
        try {
            try {
                SQLiteDatabase m28089R = m28089R();
                r4 = TextUtils.isEmpty(null);
                try {
                    if (r4 != 0) {
                        String[] strArr2 = j2 != -1 ? new String[]{String.valueOf(j2), String.valueOf(j)} : new String[]{String.valueOf(j)};
                        str2 = j2 != -1 ? "rowid <= ? and " : "";
                        StringBuilder sb = new StringBuilder(str2.length() + 148);
                        sb.append("select app_id, metadata_fingerprint from raw_events where ");
                        sb.append(str2);
                        sb.append("app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;");
                        rawQuery = m28089R.rawQuery(sb.toString(), strArr2);
                        if (!rawQuery.moveToFirst()) {
                            if (rawQuery != null) {
                                rawQuery.close();
                                return;
                            }
                            return;
                        }
                        str4 = rawQuery.getString(0);
                        string = rawQuery.getString(1);
                        rawQuery.close();
                    } else {
                        String[] strArr3 = j2 != -1 ? new String[]{null, String.valueOf(j2)} : new String[]{null};
                        str2 = j2 != -1 ? " and rowid <= ?" : "";
                        StringBuilder sb2 = new StringBuilder(str2.length() + 84);
                        sb2.append("select metadata_fingerprint from raw_events where app_id = ?");
                        sb2.append(str2);
                        sb2.append(" order by rowid limit 1;");
                        rawQuery = m28089R.rawQuery(sb2.toString(), strArr3);
                        if (!rawQuery.moveToFirst()) {
                            if (rawQuery != null) {
                                rawQuery.close();
                                return;
                            }
                            return;
                        }
                        string = rawQuery.getString(0);
                        rawQuery.close();
                    }
                    Cursor cursor3 = rawQuery;
                    String str5 = string;
                    try {
                        Cursor query = m28089R.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str4, str5}, null, null, "rowid", "2");
                        try {
                            if (!query.moveToFirst()) {
                                ((v5) this).a.b().r().m28013b("Raw event metadata record is missing. appId", q3.z(str4));
                                if (query != null) {
                                    query.close();
                                    return;
                                }
                                return;
                            }
                            try {
                                byte[] blob = query.getBlob(0);
                                try {
                                    C3922o4 m29197H1 = C3937p4.m29197H1();
                                    C4192da.m28300D(m29197H1, blob);
                                    C3937p4 m29456k = m29197H1.m29456k();
                                    if (query.moveToNext()) {
                                        ((v5) this).a.b().w().m28013b("Get multiple raw event metadata records, expected one. appId", q3.z(str4));
                                    }
                                    query.close();
                                    com.google.android.gms.common.internal.s.j(m29456k);
                                    c4157aa.f10011a = m29456k;
                                    if (j2 != -1) {
                                        str3 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                        strArr = new String[]{str4, str5, String.valueOf(j2)};
                                    } else {
                                        str3 = "app_id = ? and metadata_fingerprint = ?";
                                        strArr = new String[]{str4, str5};
                                    }
                                    Cursor query2 = m28089R.query("raw_events", new String[]{"rowid", "name", "timestamp", TransactionBreakDownItemType.DATA}, str3, strArr, null, null, "rowid", null);
                                    if (query2.moveToFirst()) {
                                        do {
                                            long j3 = query2.getLong(0);
                                            byte[] blob2 = query2.getBlob(3);
                                            try {
                                                C3765e4 m29633A = C3779f4.m29633A();
                                                C4192da.m28300D(m29633A, blob2);
                                                C3765e4 c3765e4 = m29633A;
                                                c3765e4.m29657z(query2.getString(1));
                                                c3765e4.m29669D(query2.getLong(2));
                                                if (!c4157aa.m28409a(j3, c3765e4.m29456k())) {
                                                    if (query2 != null) {
                                                        query2.close();
                                                        return;
                                                    }
                                                    return;
                                                }
                                            } catch (IOException e) {
                                                ((v5) this).a.b().r().m28012c("Data loss. Failed to merge raw event. appId", q3.z(str4), e);
                                            }
                                        } while (query2.moveToNext());
                                        if (query2 != null) {
                                            query2.close();
                                            return;
                                        }
                                        return;
                                    }
                                    ((v5) this).a.b().w().m28013b("Raw event data disappeared while in transaction. appId", q3.z(str4));
                                    if (query2 != null) {
                                        query2.close();
                                    }
                                } catch (IOException e2) {
                                    ((v5) this).a.b().r().m28012c("Data loss. Failed to merge raw event metadata. appId", q3.z(str4), e2);
                                    if (query != null) {
                                        query.close();
                                    }
                                }
                            } catch (SQLiteException e3) {
                                e = e3;
                                r4 = query;
                                ((v5) this).a.b().r().m28012c("Data loss. Error selecting raw event. appId", q3.z(str4), e);
                                if (r4 != 0) {
                                    r4.close();
                                }
                            } catch (Throwable th) {
                                th = th;
                                cursor2 = query;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteException e4) {
                            e = e4;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (SQLiteException e5) {
                        e = e5;
                        r4 = cursor3;
                    } catch (Throwable th3) {
                        th = th3;
                        cursor2 = cursor3;
                    }
                } catch (SQLiteException e6) {
                    e = e6;
                }
            } catch (Throwable th4) {
                th = th4;
                cursor2 = cursor;
            }
        } catch (SQLiteException e7) {
            e = e7;
            r4 = 0;
        } catch (Throwable th5) {
            th = th5;
        }
    }

    /* renamed from: K */
    public final int m28096K(String str, String str2) {
        com.google.android.gms.common.internal.s.f(str);
        com.google.android.gms.common.internal.s.f(str2);
        h();
        m27986i();
        try {
            return m28089R().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            ((v5) this).a.b().r().m28011d("Error deleting conditional property", q3.z(str), ((v5) this).a.D().m28044f(str2), e);
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: N */
    public final long m28093N(String str, String str2) {
        long m28094M;
        com.google.android.gms.common.internal.s.f(str);
        com.google.android.gms.common.internal.s.f("first_open_count");
        h();
        m27986i();
        SQLiteDatabase m28089R = m28089R();
        m28089R.beginTransaction();
        long j = 0;
        try {
            try {
                StringBuilder sb = new StringBuilder(48);
                sb.append("select ");
                sb.append("first_open_count");
                sb.append(" from app2 where app_id=?");
                m28094M = m28094M(sb.toString(), new String[]{str}, -1L);
                if (m28094M == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", (Integer) 0);
                    contentValues.put("previous_install_count", (Integer) 0);
                    if (m28089R.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                        ((v5) this).a.b().r().m28012c("Failed to insert column (got -1). appId", q3.z(str), "first_open_count");
                        return -1L;
                    }
                    m28094M = 0;
                }
            } catch (SQLiteException e) {
                e = e;
            }
            try {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("app_id", str);
                contentValues2.put("first_open_count", Long.valueOf(1 + m28094M));
                if (m28089R.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                    ((v5) this).a.b().r().m28012c("Failed to update column (got 0). appId", q3.z(str), "first_open_count");
                    return -1L;
                }
                m28089R.setTransactionSuccessful();
                return m28094M;
            } catch (SQLiteException e2) {
                e = e2;
                j = m28094M;
                ((v5) this).a.b().r().m28011d("Error inserting column. appId", q3.z(str), "first_open_count", e);
                m28089R.endTransaction();
                return j;
            }
        } finally {
            m28089R.endTransaction();
        }
    }

    /* renamed from: O */
    public final long m28092O() {
        return m28094M("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    /* renamed from: P */
    public final long m28091P() {
        return m28094M("select max(timestamp) from raw_events", null, 0L);
    }

    /* renamed from: Q */
    public final long m28090Q(String str) {
        com.google.android.gms.common.internal.s.f(str);
        return m28094M("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R */
    public final SQLiteDatabase m28089R() {
        h();
        try {
            return this.f10417d.getWritableDatabase();
        } catch (SQLiteException e) {
            ((v5) this).a.b().w().m28013b("Error opening database", e);
            throw e;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x00db: MOVE  (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:47:0x00db */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00de  */
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle m28088S(java.lang.String r8) {
        /*
            r7 = this;
            r7.h()
            r7.m27986i()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.m28089R()     // Catch: java.lang.Throwable -> Lc1 android.database.sqlite.SQLiteException -> Lc3
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> Lc1 android.database.sqlite.SQLiteException -> Lc3
            r3 = 0
            r2[r3] = r8     // Catch: java.lang.Throwable -> Lc1 android.database.sqlite.SQLiteException -> Lc3
            java.lang.String r4 = "select parameters from default_event_params where app_id=?"
            android.database.Cursor r1 = r1.rawQuery(r4, r2)     // Catch: java.lang.Throwable -> Lc1 android.database.sqlite.SQLiteException -> Lc3
            boolean r2 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> Lbf java.lang.Throwable -> Lda
            if (r2 != 0) goto L32
            com.google.android.gms.measurement.internal.b5 r8 = r7.a     // Catch: android.database.sqlite.SQLiteException -> Lbf java.lang.Throwable -> Lda
            com.google.android.gms.measurement.internal.q3 r8 = r8.b()     // Catch: android.database.sqlite.SQLiteException -> Lbf java.lang.Throwable -> Lda
            com.google.android.gms.measurement.internal.o3 r8 = r8.v()     // Catch: android.database.sqlite.SQLiteException -> Lbf java.lang.Throwable -> Lda
            java.lang.String r2 = "Default event parameters not found"
            r8.m28014a(r2)     // Catch: android.database.sqlite.SQLiteException -> Lbf java.lang.Throwable -> Lda
            if (r1 == 0) goto L31
            r1.close()
        L31:
            return r0
        L32:
            byte[] r2 = r1.getBlob(r3)     // Catch: android.database.sqlite.SQLiteException -> Lbf java.lang.Throwable -> Lda
            com.google.android.gms.internal.measurement.e4 r3 = com.google.android.gms.internal.measurement.C3779f4.m29633A()     // Catch: java.io.IOException -> La5 android.database.sqlite.SQLiteException -> Lbf java.lang.Throwable -> Lda
            com.google.android.gms.measurement.internal.C4192da.m28300D(r3, r2)     // Catch: java.io.IOException -> La5 android.database.sqlite.SQLiteException -> Lbf java.lang.Throwable -> Lda
            com.google.android.gms.internal.measurement.e4 r3 = (com.google.android.gms.internal.measurement.C3765e4) r3     // Catch: java.io.IOException -> La5 android.database.sqlite.SQLiteException -> Lbf java.lang.Throwable -> Lda
            com.google.android.gms.internal.measurement.m8 r2 = r3.m29456k()     // Catch: java.io.IOException -> La5 android.database.sqlite.SQLiteException -> Lbf java.lang.Throwable -> Lda
            com.google.android.gms.internal.measurement.f4 r2 = (com.google.android.gms.internal.measurement.C3779f4) r2     // Catch: java.io.IOException -> La5 android.database.sqlite.SQLiteException -> Lbf java.lang.Throwable -> Lda
            com.google.android.gms.measurement.internal.ba r8 = r7.f10625b     // Catch: android.database.sqlite.SQLiteException -> Lbf java.lang.Throwable -> Lda
            r8.m28364e0()     // Catch: android.database.sqlite.SQLiteException -> Lbf java.lang.Throwable -> Lda
            java.util.List r8 = r2.m29629E()     // Catch: android.database.sqlite.SQLiteException -> Lbf java.lang.Throwable -> Lda
            android.os.Bundle r2 = new android.os.Bundle     // Catch: android.database.sqlite.SQLiteException -> Lbf java.lang.Throwable -> Lda
            r2.<init>()     // Catch: android.database.sqlite.SQLiteException -> Lbf java.lang.Throwable -> Lda
            java.util.Iterator r8 = r8.iterator()     // Catch: android.database.sqlite.SQLiteException -> Lbf java.lang.Throwable -> Lda
        L57:
            boolean r3 = r8.hasNext()     // Catch: android.database.sqlite.SQLiteException -> Lbf java.lang.Throwable -> Lda
            if (r3 == 0) goto L9f
            java.lang.Object r3 = r8.next()     // Catch: android.database.sqlite.SQLiteException -> Lbf java.lang.Throwable -> Lda
            com.google.android.gms.internal.measurement.j4 r3 = (com.google.android.gms.internal.measurement.C3843j4) r3     // Catch: android.database.sqlite.SQLiteException -> Lbf java.lang.Throwable -> Lda
            java.lang.String r4 = r3.m29486C()     // Catch: android.database.sqlite.SQLiteException -> Lbf java.lang.Throwable -> Lda
            boolean r5 = r3.m29473P()     // Catch: android.database.sqlite.SQLiteException -> Lbf java.lang.Throwable -> Lda
            if (r5 == 0) goto L75
            double r5 = r3.m29467w()     // Catch: android.database.sqlite.SQLiteException -> Lbf java.lang.Throwable -> Lda
            r2.putDouble(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> Lbf java.lang.Throwable -> Lda
            goto L57
        L75:
            boolean r5 = r3.m29472Q()     // Catch: android.database.sqlite.SQLiteException -> Lbf java.lang.Throwable -> Lda
            if (r5 == 0) goto L83
            float r3 = r3.m29466x()     // Catch: android.database.sqlite.SQLiteException -> Lbf java.lang.Throwable -> Lda
            r2.putFloat(r4, r3)     // Catch: android.database.sqlite.SQLiteException -> Lbf java.lang.Throwable -> Lda
            goto L57
        L83:
            boolean r5 = r3.m29469T()     // Catch: android.database.sqlite.SQLiteException -> Lbf java.lang.Throwable -> Lda
            if (r5 == 0) goto L91
            java.lang.String r3 = r3.m29485D()     // Catch: android.database.sqlite.SQLiteException -> Lbf java.lang.Throwable -> Lda
            r2.putString(r4, r3)     // Catch: android.database.sqlite.SQLiteException -> Lbf java.lang.Throwable -> Lda
            goto L57
        L91:
            boolean r5 = r3.m29471R()     // Catch: android.database.sqlite.SQLiteException -> Lbf java.lang.Throwable -> Lda
            if (r5 == 0) goto L57
            long r5 = r3.m29464z()     // Catch: android.database.sqlite.SQLiteException -> Lbf java.lang.Throwable -> Lda
            r2.putLong(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> Lbf java.lang.Throwable -> Lda
            goto L57
        L9f:
            if (r1 == 0) goto La4
            r1.close()
        La4:
            return r2
        La5:
            r2 = move-exception
            com.google.android.gms.measurement.internal.b5 r3 = r7.a     // Catch: android.database.sqlite.SQLiteException -> Lbf java.lang.Throwable -> Lda
            com.google.android.gms.measurement.internal.q3 r3 = r3.b()     // Catch: android.database.sqlite.SQLiteException -> Lbf java.lang.Throwable -> Lda
            com.google.android.gms.measurement.internal.o3 r3 = r3.r()     // Catch: android.database.sqlite.SQLiteException -> Lbf java.lang.Throwable -> Lda
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.q3.z(r8)     // Catch: android.database.sqlite.SQLiteException -> Lbf java.lang.Throwable -> Lda
            r3.m28012c(r4, r8, r2)     // Catch: android.database.sqlite.SQLiteException -> Lbf java.lang.Throwable -> Lda
            if (r1 == 0) goto Lbe
            r1.close()
        Lbe:
            return r0
        Lbf:
            r8 = move-exception
            goto Lc5
        Lc1:
            r8 = move-exception
            goto Ldc
        Lc3:
            r8 = move-exception
            r1 = r0
        Lc5:
            com.google.android.gms.measurement.internal.b5 r2 = r7.a     // Catch: java.lang.Throwable -> Lda
            com.google.android.gms.measurement.internal.q3 r2 = r2.b()     // Catch: java.lang.Throwable -> Lda
            com.google.android.gms.measurement.internal.o3 r2 = r2.r()     // Catch: java.lang.Throwable -> Lda
            java.lang.String r3 = "Error selecting default event parameters"
            r2.m28013b(r3, r8)     // Catch: java.lang.Throwable -> Lda
            if (r1 == 0) goto Ld9
            r1.close()
        Ld9:
            return r0
        Lda:
            r8 = move-exception
            r0 = r1
        Ldc:
            if (r0 == 0) goto Le1
            r0.close()
        Le1:
            goto Le3
        Le2:
            throw r8
        Le3:
            goto Le2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4260k.m28088S(java.lang.String):android.os.Bundle");
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x020c: MOVE  (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:60:0x020c */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x011d A[Catch: SQLiteException -> 0x01ec, all -> 0x020b, TryCatch #1 {all -> 0x020b, blocks: (B:4:0x005f, B:9:0x006b, B:11:0x00ce, B:16:0x00d8, B:20:0x0122, B:22:0x0159, B:26:0x0167, B:25:0x0163, B:27:0x016a, B:29:0x0172, B:33:0x017a, B:37:0x0193, B:39:0x019e, B:40:0x01b0, B:42:0x01c1, B:43:0x01ca, B:45:0x01d3, B:36:0x018f, B:19:0x011d, B:55:0x01f2), top: B:64:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0159 A[Catch: SQLiteException -> 0x01ec, all -> 0x020b, TryCatch #1 {all -> 0x020b, blocks: (B:4:0x005f, B:9:0x006b, B:11:0x00ce, B:16:0x00d8, B:20:0x0122, B:22:0x0159, B:26:0x0167, B:25:0x0163, B:27:0x016a, B:29:0x0172, B:33:0x017a, B:37:0x0193, B:39:0x019e, B:40:0x01b0, B:42:0x01c1, B:43:0x01ca, B:45:0x01d3, B:36:0x018f, B:19:0x011d, B:55:0x01f2), top: B:64:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x018f A[Catch: SQLiteException -> 0x01ec, all -> 0x020b, TryCatch #1 {all -> 0x020b, blocks: (B:4:0x005f, B:9:0x006b, B:11:0x00ce, B:16:0x00d8, B:20:0x0122, B:22:0x0159, B:26:0x0167, B:25:0x0163, B:27:0x016a, B:29:0x0172, B:33:0x017a, B:37:0x0193, B:39:0x019e, B:40:0x01b0, B:42:0x01c1, B:43:0x01ca, B:45:0x01d3, B:36:0x018f, B:19:0x011d, B:55:0x01f2), top: B:64:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x019e A[Catch: SQLiteException -> 0x01ec, all -> 0x020b, TryCatch #1 {all -> 0x020b, blocks: (B:4:0x005f, B:9:0x006b, B:11:0x00ce, B:16:0x00d8, B:20:0x0122, B:22:0x0159, B:26:0x0167, B:25:0x0163, B:27:0x016a, B:29:0x0172, B:33:0x017a, B:37:0x0193, B:39:0x019e, B:40:0x01b0, B:42:0x01c1, B:43:0x01ca, B:45:0x01d3, B:36:0x018f, B:19:0x011d, B:55:0x01f2), top: B:64:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01c1 A[Catch: SQLiteException -> 0x01ec, all -> 0x020b, TryCatch #1 {all -> 0x020b, blocks: (B:4:0x005f, B:9:0x006b, B:11:0x00ce, B:16:0x00d8, B:20:0x0122, B:22:0x0159, B:26:0x0167, B:25:0x0163, B:27:0x016a, B:29:0x0172, B:33:0x017a, B:37:0x0193, B:39:0x019e, B:40:0x01b0, B:42:0x01c1, B:43:0x01ca, B:45:0x01d3, B:36:0x018f, B:19:0x011d, B:55:0x01f2), top: B:64:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01d3 A[Catch: SQLiteException -> 0x01ec, all -> 0x020b, TRY_LEAVE, TryCatch #1 {all -> 0x020b, blocks: (B:4:0x005f, B:9:0x006b, B:11:0x00ce, B:16:0x00d8, B:20:0x0122, B:22:0x0159, B:26:0x0167, B:25:0x0163, B:27:0x016a, B:29:0x0172, B:33:0x017a, B:37:0x0193, B:39:0x019e, B:40:0x01b0, B:42:0x01c1, B:43:0x01ca, B:45:0x01d3, B:36:0x018f, B:19:0x011d, B:55:0x01f2), top: B:64:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x020f  */
    /* renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.C4220g5 m28087T(java.lang.String r34) {
        /*
            Method dump skipped, instructions count: 531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4260k.m28087T(java.lang.String):com.google.android.gms.measurement.internal.g5");
    }

    /* JADX WARN: Not initialized variable reg: 10, insn: 0x012b: MOVE  (r9 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]), block:B:33:0x012b */
    /* JADX WARN: Removed duplicated region for block: B:35:0x012e  */
    /* renamed from: U */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.C4169c m28086U(java.lang.String r31, java.lang.String r32) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4260k.m28086U(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.c");
    }

    /* renamed from: V */
    public final C4237i m28085V(long j, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return m28084W(j, str, 1L, false, false, z3, false, z5);
    }

    /* renamed from: W */
    public final C4237i m28084W(long j, String str, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        com.google.android.gms.common.internal.s.f(str);
        h();
        m27986i();
        String[] strArr = {str};
        C4237i c4237i = new C4237i();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase m28089R = m28089R();
                Cursor query = m28089R.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    ((v5) this).a.b().w().m28013b("Not updating daily counts, app is not known. appId", q3.z(str));
                    if (query != null) {
                        query.close();
                    }
                    return c4237i;
                }
                if (query.getLong(0) == j) {
                    c4237i.b = query.getLong(1);
                    c4237i.a = query.getLong(2);
                    c4237i.f10350c = query.getLong(3);
                    c4237i.d = query.getLong(4);
                    c4237i.e = query.getLong(5);
                }
                if (z) {
                    c4237i.b += j2;
                }
                if (z2) {
                    c4237i.a += j2;
                }
                if (z3) {
                    c4237i.f10350c += j2;
                }
                if (z4) {
                    c4237i.d += j2;
                }
                if (z5) {
                    c4237i.e += j2;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j));
                contentValues.put("daily_public_events_count", Long.valueOf(c4237i.a));
                contentValues.put("daily_events_count", Long.valueOf(c4237i.b));
                contentValues.put("daily_conversions_count", Long.valueOf(c4237i.f10350c));
                contentValues.put("daily_error_events_count", Long.valueOf(c4237i.d));
                contentValues.put("daily_realtime_events_count", Long.valueOf(c4237i.e));
                m28089R.update("apps", contentValues, "app_id=?", strArr);
                if (query != null) {
                    query.close();
                }
                return c4237i;
            } catch (SQLiteException e) {
                ((v5) this).a.b().r().m28012c("Error updating daily counts. appId", q3.z(str), e);
                if (0 != 0) {
                    cursor.close();
                }
                return c4237i;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0154  */
    /* renamed from: X */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.C4332q m28083X(java.lang.String r28, java.lang.String r29) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4260k.m28083X(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.q");
    }

    /* JADX WARN: Not initialized variable reg: 11, insn: 0x00a9: MOVE  (r10 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:31:0x00a9 */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ac  */
    /* renamed from: Z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.C4225ga m28081Z(java.lang.String r20, java.lang.String r21) {
        /*
            r19 = this;
            r1 = r19
            r9 = r21
            com.google.android.gms.common.internal.s.f(r20)
            com.google.android.gms.common.internal.s.f(r21)
            r19.h()
            r19.m27986i()
            r10 = 0
            android.database.sqlite.SQLiteDatabase r11 = r19.m28089R()     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteException -> L83
            java.lang.String r0 = "set_timestamp"
            java.lang.String r2 = "value"
            java.lang.String r3 = "origin"
            java.lang.String[] r13 = new java.lang.String[]{r0, r2, r3}     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteException -> L83
            r0 = 2
            java.lang.String[] r15 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteException -> L83
            r2 = 0
            r15[r2] = r20     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteException -> L83
            r3 = 1
            r15[r3] = r9     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteException -> L83
            java.lang.String r12 = "user_attributes"
            java.lang.String r14 = "app_id=? and name=?"
            r16 = 0
            r17 = 0
            r18 = 0
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteException -> L83
            boolean r4 = r11.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L7f java.lang.Throwable -> La8
            if (r4 != 0) goto L42
            if (r11 == 0) goto L41
            r11.close()
        L41:
            return r10
        L42:
            long r6 = r11.getLong(r2)     // Catch: android.database.sqlite.SQLiteException -> L7f java.lang.Throwable -> La8
            java.lang.Object r8 = r1.m28080a0(r11, r3)     // Catch: android.database.sqlite.SQLiteException -> L7f java.lang.Throwable -> La8
            if (r8 != 0) goto L52
            if (r11 == 0) goto L51
            r11.close()
        L51:
            return r10
        L52:
            java.lang.String r4 = r11.getString(r0)     // Catch: android.database.sqlite.SQLiteException -> L7f java.lang.Throwable -> La8
            com.google.android.gms.measurement.internal.ga r0 = new com.google.android.gms.measurement.internal.ga     // Catch: android.database.sqlite.SQLiteException -> L7f java.lang.Throwable -> La8
            r2 = r0
            r3 = r20
            r5 = r21
            r2.<init>(r3, r4, r5, r6, r8)     // Catch: android.database.sqlite.SQLiteException -> L7f java.lang.Throwable -> La8
            boolean r2 = r11.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L7f java.lang.Throwable -> La8
            if (r2 == 0) goto L79
            com.google.android.gms.measurement.internal.b5 r2 = r1.a     // Catch: android.database.sqlite.SQLiteException -> L7f java.lang.Throwable -> La8
            com.google.android.gms.measurement.internal.q3 r2 = r2.b()     // Catch: android.database.sqlite.SQLiteException -> L7f java.lang.Throwable -> La8
            com.google.android.gms.measurement.internal.o3 r2 = r2.r()     // Catch: android.database.sqlite.SQLiteException -> L7f java.lang.Throwable -> La8
            java.lang.String r3 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.q3.z(r20)     // Catch: android.database.sqlite.SQLiteException -> L7f java.lang.Throwable -> La8
            r2.m28013b(r3, r4)     // Catch: android.database.sqlite.SQLiteException -> L7f java.lang.Throwable -> La8
        L79:
            if (r11 == 0) goto L7e
            r11.close()
        L7e:
            return r0
        L7f:
            r0 = move-exception
            goto L85
        L81:
            r0 = move-exception
            goto Laa
        L83:
            r0 = move-exception
            r11 = r10
        L85:
            com.google.android.gms.measurement.internal.b5 r2 = r1.a     // Catch: java.lang.Throwable -> La8
            com.google.android.gms.measurement.internal.q3 r2 = r2.b()     // Catch: java.lang.Throwable -> La8
            com.google.android.gms.measurement.internal.o3 r2 = r2.r()     // Catch: java.lang.Throwable -> La8
            java.lang.String r3 = "Error querying user property. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.q3.z(r20)     // Catch: java.lang.Throwable -> La8
            com.google.android.gms.measurement.internal.b5 r5 = r1.a     // Catch: java.lang.Throwable -> La8
            com.google.android.gms.measurement.internal.l3 r5 = r5.D()     // Catch: java.lang.Throwable -> La8
            java.lang.String r5 = r5.m28044f(r9)     // Catch: java.lang.Throwable -> La8
            r2.m28011d(r3, r4, r5, r0)     // Catch: java.lang.Throwable -> La8
            if (r11 == 0) goto La7
            r11.close()
        La7:
            return r10
        La8:
            r0 = move-exception
            r10 = r11
        Laa:
            if (r10 == 0) goto Laf
            r10.close()
        Laf:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4260k.m28081Z(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.ga");
    }

    /* renamed from: a0 */
    final Object m28080a0(Cursor cursor, int i) {
        int type = cursor.getType(i);
        if (type == 0) {
            ((v5) this).a.b().r().m28014a("Loaded invalid null value from database");
            return null;
        } else if (type != 1) {
            if (type != 2) {
                if (type != 3) {
                    if (type != 4) {
                        ((v5) this).a.b().r().m28013b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                        return null;
                    }
                    ((v5) this).a.b().r().m28014a("Loaded invalid blob type value, ignoring it");
                    return null;
                }
                return cursor.getString(i);
            }
            return Double.valueOf(cursor.getDouble(i));
        } else {
            return Long.valueOf(cursor.getLong(i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /* renamed from: b0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m28079b0() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.m28089R()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L24 android.database.sqlite.SQLiteException -> L26
            boolean r2 = r0.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L22 java.lang.Throwable -> L3e
            if (r2 == 0) goto L1c
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: android.database.sqlite.SQLiteException -> L22 java.lang.Throwable -> L3e
            if (r0 == 0) goto L1b
            r0.close()
        L1b:
            return r1
        L1c:
            if (r0 == 0) goto L21
            r0.close()
        L21:
            return r1
        L22:
            r2 = move-exception
            goto L29
        L24:
            r0 = move-exception
            goto L42
        L26:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L29:
            com.google.android.gms.measurement.internal.b5 r3 = r6.a     // Catch: java.lang.Throwable -> L3e
            com.google.android.gms.measurement.internal.q3 r3 = r3.b()     // Catch: java.lang.Throwable -> L3e
            com.google.android.gms.measurement.internal.o3 r3 = r3.r()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.m28013b(r4, r2)     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L3d
            r0.close()
        L3d:
            return r1
        L3e:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L42:
            if (r1 == 0) goto L47
            r1.close()
        L47:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4260k.m28079b0():java.lang.String");
    }

    /* renamed from: c0 */
    public final List<C4169c> m28078c0(String str, String str2, String str3) {
        com.google.android.gms.common.internal.s.f(str);
        h();
        m27986i();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return m28077d0(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0058, code lost:
        r2 = ((com.google.android.gms.measurement.internal.v5) r27).a.b().r();
        ((com.google.android.gms.measurement.internal.v5) r27).a.z();
        r2.m28013b("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /* renamed from: d0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.google.android.gms.measurement.internal.C4169c> m28077d0(java.lang.String r28, java.lang.String[] r29) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4260k.m28077d0(java.lang.String, java.lang.String[]):java.util.List");
    }

    /* renamed from: e0 */
    public final List<C4225ga> m28076e0(String str) {
        com.google.android.gms.common.internal.s.f(str);
        h();
        m27986i();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                ((v5) this).a.z();
                cursor = m28089R().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (!cursor.moveToFirst()) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    return arrayList;
                }
                do {
                    String string = cursor.getString(0);
                    String string2 = cursor.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str2 = string2;
                    long j = cursor.getLong(2);
                    Object m28080a0 = m28080a0(cursor, 3);
                    if (m28080a0 == null) {
                        ((v5) this).a.b().r().m28013b("Read invalid user property value, ignoring it. appId", q3.z(str));
                    } else {
                        arrayList.add(new C4225ga(str, str2, string, j, m28080a0));
                    }
                } while (cursor.moveToNext());
                if (cursor != null) {
                    cursor.close();
                }
                return arrayList;
            } catch (SQLiteException e) {
                ((v5) this).a.b().r().m28012c("Error querying user properties. appId", q3.z(str), e);
                List<C4225ga> emptyList = Collections.emptyList();
                if (cursor != null) {
                    cursor.close();
                }
                return emptyList;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x009e, code lost:
        r2 = ((com.google.android.gms.measurement.internal.v5) r16).a.b().r();
        ((com.google.android.gms.measurement.internal.v5) r16).a.z();
        r2.m28013b("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0121  */
    /* renamed from: f0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.google.android.gms.measurement.internal.C4225ga> m28075f0(java.lang.String r17, java.lang.String r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4260k.m28075f0(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    /* renamed from: g0 */
    public final void m28074g0() {
        m27986i();
        m28089R().beginTransaction();
    }

    /* renamed from: h0 */
    public final void m28073h0(List<Long> list) {
        com.google.android.gms.common.internal.s.j(list);
        h();
        m27986i();
        StringBuilder sb = new StringBuilder("rowid in (");
        for (int i = 0; i < list.size(); i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(list.get(i).longValue());
        }
        sb.append(")");
        int delete = m28089R().delete("raw_events", sb.toString(), null);
        if (delete != list.size()) {
            ((v5) this).a.b().r().m28012c("Deleted fewer rows from raw events table than expected", Integer.valueOf(delete), Integer.valueOf(list.size()));
        }
    }

    /* renamed from: i0 */
    public final void m28072i0() {
        m27986i();
        m28089R().endTransaction();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j0 */
    public final void m28071j0(List<Long> list) {
        h();
        m27986i();
        com.google.android.gms.common.internal.s.j(list);
        com.google.android.gms.common.internal.s.l(list.size());
        if (m28060w()) {
            String join = TextUtils.join(",", list);
            StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
            sb.append("(");
            sb.append(join);
            sb.append(")");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder(sb2.length() + 80);
            sb3.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
            sb3.append(sb2);
            sb3.append(" AND retry_count =  2147483647 LIMIT 1");
            if (m28095L(sb3.toString(), null) > 0) {
                ((v5) this).a.b().w().m28014a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase m28089R = m28089R();
                StringBuilder sb4 = new StringBuilder(sb2.length() + 127);
                sb4.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb4.append(sb2);
                sb4.append(" AND (retry_count IS NULL OR retry_count < ");
                sb4.append(Integer.MAX_VALUE);
                sb4.append(")");
                m28089R.execSQL(sb4.toString());
            } catch (SQLiteException e) {
                ((v5) this).a.b().r().m28013b("Error incrementing retry count. error", e);
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4353r9
    /* renamed from: l */
    protected final boolean mo27835l() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public final void m28070m() {
        h();
        m27986i();
        if (m28060w()) {
            long m28404a = this.f10625b.m28368c0().f10803g.m28404a();
            long mo31535a = ((v5) this).a.c().mo31535a();
            long abs = Math.abs(mo31535a - m28404a);
            ((v5) this).a.z();
            if (abs > C4173c3.f10163y.m28406a(null).longValue()) {
                this.f10625b.m28368c0().f10803g.m28403b(mo31535a);
                h();
                m27986i();
                if (m28060w()) {
                    SQLiteDatabase m28089R = m28089R();
                    ((v5) this).a.z();
                    int delete = m28089R.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(((v5) this).a.c().currentTimeMillis()), String.valueOf(C4215g.i())});
                    if (delete > 0) {
                        ((v5) this).a.b().v().m28013b("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                    }
                }
            }
        }
    }

    /* renamed from: n */
    public final void m28069n(String str, String str2) {
        com.google.android.gms.common.internal.s.f(str);
        com.google.android.gms.common.internal.s.f(str2);
        h();
        m27986i();
        try {
            m28089R().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            ((v5) this).a.b().r().m28011d("Error deleting user property. appId", q3.z(str), ((v5) this).a.D().m28044f(str2), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0343, code lost:
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0344, code lost:
        r11.put("session_scoped", r0);
        r11.put(ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType.DATA, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0358, code lost:
        if (m28089R().insertWithOnConflict("property_filters", null, r11, 5) != (-1)) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x035a, code lost:
        ((com.google.android.gms.measurement.internal.v5) r23).a.b().r().m28013b("Failed to insert property filter (got -1). appId", com.google.android.gms.measurement.internal.q3.z(r24));
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x036e, code lost:
        r0 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0372, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0373, code lost:
        ((com.google.android.gms.measurement.internal.v5) r23).a.b().r().m28012c("Error storing property filter. appId", com.google.android.gms.measurement.internal.q3.z(r24), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0386, code lost:
        m27986i();
        h();
        com.google.android.gms.common.internal.s.f(r24);
        r0 = m28089R();
        r3 = r17;
        r0.delete("property_filters", r3, new java.lang.String[]{r24, java.lang.String.valueOf(r10)});
        r0.delete("event_filters", r3, new java.lang.String[]{r24, java.lang.String.valueOf(r10)});
        r17 = r3;
        r4 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x03bd, code lost:
        r4 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x018b, code lost:
        r11 = r0.m28578D().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0197, code lost:
        if (r11.hasNext() == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01a3, code lost:
        if (r11.next().m29494F() != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01a5, code lost:
        ((com.google.android.gms.measurement.internal.v5) r23).a.b().w().m28012c("Property filter with no ID. Audience definition ignored. appId, audienceId", com.google.android.gms.measurement.internal.q3.z(r24), java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01be, code lost:
        r11 = r0.m28579C().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01d4, code lost:
        if (r11.hasNext() == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01d6, code lost:
        r12 = r11.next();
        m27986i();
        h();
        com.google.android.gms.common.internal.s.f(r24);
        com.google.android.gms.common.internal.s.j(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01f0, code lost:
        if (android.text.TextUtils.isEmpty(r12.m29826C()) == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01f2, code lost:
        r0 = ((com.google.android.gms.measurement.internal.v5) r23).a.b().w();
        r8 = com.google.android.gms.measurement.internal.q3.z(r24);
        r11 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x020a, code lost:
        if (r12.m29818K() == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x020c, code lost:
        r20 = java.lang.Integer.valueOf(r12.m29815x());
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0217, code lost:
        r20 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0219, code lost:
        r0.m28011d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r8, r11, java.lang.String.valueOf(r20));
        r21 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0224, code lost:
        r3 = r12.m29845j();
        r21 = r4;
        r4 = new android.content.ContentValues();
        r4.put("app_id", r24);
        r4.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x023d, code lost:
        if (r12.m29818K() == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x023f, code lost:
        r8 = java.lang.Integer.valueOf(r12.m29815x());
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0248, code lost:
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0249, code lost:
        r4.put("filter_id", r8);
        r4.put("event_name", r12.m29826C());
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0259, code lost:
        if (r12.m29817L() == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x025b, code lost:
        r8 = java.lang.Boolean.valueOf(r12.m29820I());
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0264, code lost:
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0265, code lost:
        r4.put("session_scoped", r8);
        r4.put(ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType.DATA, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0279, code lost:
        if (m28089R().insertWithOnConflict("event_filters", null, r4, 5) != (-1)) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x027b, code lost:
        ((com.google.android.gms.measurement.internal.v5) r23).a.b().r().m28013b("Failed to insert event filter (got -1). appId", com.google.android.gms.measurement.internal.q3.z(r24));
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x028e, code lost:
        r4 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0294, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0295, code lost:
        ((com.google.android.gms.measurement.internal.v5) r23).a.b().r().m28012c("Error storing event filter. appId", com.google.android.gms.measurement.internal.q3.z(r24), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x02aa, code lost:
        r21 = r4;
        r0 = r0.m28578D().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x02b8, code lost:
        if (r0.hasNext() == false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x02ba, code lost:
        r3 = r0.next();
        m27986i();
        h();
        com.google.android.gms.common.internal.s.f(r24);
        com.google.android.gms.common.internal.s.j(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x02d4, code lost:
        if (android.text.TextUtils.isEmpty(r3.m29499A()) == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02d6, code lost:
        r0 = ((com.google.android.gms.measurement.internal.v5) r23).a.b().w();
        r7 = com.google.android.gms.measurement.internal.q3.z(r24);
        r8 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02ee, code lost:
        if (r3.m29494F() == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02f0, code lost:
        r3 = java.lang.Integer.valueOf(r3.m29492w());
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02f9, code lost:
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02fa, code lost:
        r0.m28011d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r7, r8, java.lang.String.valueOf(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0303, code lost:
        r4 = r3.m29845j();
        r11 = new android.content.ContentValues();
        r11.put("app_id", r24);
        r11.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x031a, code lost:
        if (r3.m29494F() == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x031c, code lost:
        r12 = java.lang.Integer.valueOf(r3.m29492w());
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0325, code lost:
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0326, code lost:
        r11.put("filter_id", r12);
        r22 = r0;
        r11.put("property_name", r3.m29499A());
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0338, code lost:
        if (r3.m29493G() == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x033a, code lost:
        r0 = java.lang.Boolean.valueOf(r3.m29495E());
     */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m28068o(java.lang.String r24, java.util.List<com.google.android.gms.internal.measurement.C4094z2> r25) {
        /*
            Method dump skipped, instructions count: 1219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4260k.m28068o(java.lang.String, java.util.List):void");
    }

    /* renamed from: p */
    public final void m28067p() {
        m27986i();
        m28089R().setTransactionSuccessful();
    }

    /* renamed from: q */
    public final void m28066q(C4220g5 c4220g5) {
        com.google.android.gms.common.internal.s.j(c4220g5);
        h();
        m27986i();
        String m28220e0 = c4220g5.m28220e0();
        com.google.android.gms.common.internal.s.j(m28220e0);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", m28220e0);
        contentValues.put("app_instance_id", c4220g5.m28218f0());
        contentValues.put("gmp_app_id", c4220g5.m28208k0());
        contentValues.put("resettable_device_id_hash", c4220g5.m28227b());
        contentValues.put("last_bundle_index", Long.valueOf(c4220g5.m28230Z()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(c4220g5.m28228a0()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(c4220g5.m28231Y()));
        contentValues.put("app_version", c4220g5.m28214h0());
        contentValues.put("app_store", c4220g5.m28216g0());
        contentValues.put("gmp_version", Long.valueOf(c4220g5.m28232X()));
        contentValues.put("dev_cert_hash", Long.valueOf(c4220g5.m28235U()));
        contentValues.put("measurement_enabled", Boolean.valueOf(c4220g5.m28245K()));
        contentValues.put("day", Long.valueOf(c4220g5.m28236T()));
        contentValues.put("daily_public_events_count", Long.valueOf(c4220g5.m28238R()));
        contentValues.put("daily_events_count", Long.valueOf(c4220g5.m28239Q()));
        contentValues.put("daily_conversions_count", Long.valueOf(c4220g5.m28241O()));
        contentValues.put("config_fetched_time", Long.valueOf(c4220g5.m28242N()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(c4220g5.m28233W()));
        contentValues.put("app_version_int", Long.valueOf(c4220g5.m28243M()));
        contentValues.put("firebase_instance_id", c4220g5.m28212i0());
        contentValues.put("daily_error_events_count", Long.valueOf(c4220g5.m28240P()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(c4220g5.m28237S()));
        contentValues.put("health_monitor_sample", c4220g5.m28229a());
        contentValues.put("android_id", Long.valueOf(c4220g5.m28255A()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(c4220g5.m28246J()));
        contentValues.put("admob_app_id", c4220g5.m28224c0());
        contentValues.put("dynamite_version", Long.valueOf(c4220g5.m28234V()));
        List<String> m28225c = c4220g5.m28225c();
        if (m28225c != null) {
            if (m28225c.size() == 0) {
                ((v5) this).a.b().w().m28013b("Safelisted events should not be an empty list. appId", m28220e0);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", m28225c));
            }
        }
        C3710ad.m29843b();
        if (((v5) this).a.z().B(m28220e0, C4173c3.f10122d0)) {
            contentValues.put("ga_app_id", c4220g5.m28210j0());
        }
        try {
            SQLiteDatabase m28089R = m28089R();
            if (m28089R.update("apps", contentValues, "app_id = ?", new String[]{m28220e0}) == 0 && m28089R.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                ((v5) this).a.b().r().m28013b("Failed to insert/update app (got -1). appId", q3.z(m28220e0));
            }
        } catch (SQLiteException e) {
            ((v5) this).a.b().r().m28012c("Error storing app. appId", q3.z(m28220e0), e);
        }
    }

    /* renamed from: r */
    public final void m28065r(C4332q c4332q) {
        com.google.android.gms.common.internal.s.j(c4332q);
        h();
        m27986i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", c4332q.f10598a);
        contentValues.put("name", c4332q.f10599b);
        contentValues.put("lifetime_count", Long.valueOf(c4332q.f10600c));
        contentValues.put("current_bundle_count", Long.valueOf(c4332q.f10601d));
        contentValues.put("last_fire_timestamp", Long.valueOf(c4332q.f10603f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(c4332q.f10604g));
        contentValues.put("last_bundled_day", c4332q.f10605h);
        contentValues.put("last_sampled_complex_event_id", c4332q.f10606i);
        contentValues.put("last_sampling_rate", c4332q.f10607j);
        contentValues.put("current_session_count", Long.valueOf(c4332q.f10602e));
        Boolean bool = c4332q.f10608k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (m28089R().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                ((v5) this).a.b().r().m28013b("Failed to insert/update event aggregates (got -1). appId", q3.z(c4332q.f10598a));
            }
        } catch (SQLiteException e) {
            ((v5) this).a.b().r().m28012c("Error storing event aggregates. appId", q3.z(c4332q.f10598a), e);
        }
    }

    /* renamed from: s */
    public final void m28064s(String str, byte[] bArr, String str2) {
        com.google.android.gms.common.internal.s.f(str);
        h();
        m27986i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        try {
            if (m28089R().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                ((v5) this).a.b().r().m28013b("Failed to update remote config (got 0). appId", q3.z(str));
            }
        } catch (SQLiteException e) {
            ((v5) this).a.b().r().m28012c("Error storing remote config. appId", q3.z(str), e);
        }
    }

    /* renamed from: t */
    public final boolean m28063t() {
        return m28095L("select count(1) > 0 from raw_events", null) != 0;
    }

    /* renamed from: u */
    public final boolean m28062u() {
        return m28095L("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    /* renamed from: v */
    public final boolean m28061v() {
        return m28095L("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    /* renamed from: w */
    protected final boolean m28060w() {
        Context f = ((v5) this).a.f();
        ((v5) this).a.z();
        return f.getDatabasePath("google_app_measurement.db").exists();
    }

    /* renamed from: x */
    public final boolean m28059x(String str, Long l, long j, C3779f4 c3779f4) {
        h();
        m27986i();
        com.google.android.gms.common.internal.s.j(c3779f4);
        com.google.android.gms.common.internal.s.f(str);
        com.google.android.gms.common.internal.s.j(l);
        byte[] m29845j = c3779f4.m29845j();
        ((v5) this).a.b().v().m28012c("Saving complex main event, appId, data size", ((v5) this).a.D().m28046d(str), Integer.valueOf(m29845j.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", m29845j);
        try {
            if (m28089R().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                ((v5) this).a.b().r().m28013b("Failed to insert complex main event (got -1). appId", q3.z(str));
                return false;
            }
            return true;
        } catch (SQLiteException e) {
            ((v5) this).a.b().r().m28012c("Error storing complex main event. appId", q3.z(str), e);
            return false;
        }
    }

    /* renamed from: y */
    public final boolean m28058y(C4169c c4169c) {
        com.google.android.gms.common.internal.s.j(c4169c);
        h();
        m27986i();
        String str = c4169c.f10077c;
        com.google.android.gms.common.internal.s.j(str);
        if (m28081Z(str, c4169c.f10079e.f10245d) == null) {
            long m28095L = m28095L("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            ((v5) this).a.z();
            if (m28095L >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", c4169c.f10078d);
        contentValues.put("name", c4169c.f10079e.f10245d);
        Object m28270f = c4169c.f10079e.m28270f();
        com.google.android.gms.common.internal.s.j(m28270f);
        m28097J(contentValues, "value", m28270f);
        contentValues.put("active", Boolean.valueOf(c4169c.f10081w));
        contentValues.put("trigger_event_name", c4169c.f10082x);
        contentValues.put("trigger_timeout", Long.valueOf(c4169c.f10084z));
        contentValues.put("timed_out_event", ((v5) this).a.N().c0(c4169c.f10083y));
        contentValues.put("creation_timestamp", Long.valueOf(c4169c.f10080f));
        contentValues.put("triggered_event", ((v5) this).a.N().c0(c4169c.f10074A));
        contentValues.put("triggered_timestamp", Long.valueOf(c4169c.f10079e.f10246e));
        contentValues.put("time_to_live", Long.valueOf(c4169c.f10075B));
        contentValues.put("expired_event", ((v5) this).a.N().c0(c4169c.f10076C));
        try {
            if (m28089R().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                ((v5) this).a.b().r().m28013b("Failed to insert/update conditional user property (got -1)", q3.z(str));
            }
        } catch (SQLiteException e) {
            ((v5) this).a.b().r().m28012c("Error storing conditional user property", q3.z(str), e);
        }
        return true;
    }

    /* renamed from: z */
    public final boolean m28057z(C4225ga c4225ga) {
        com.google.android.gms.common.internal.s.j(c4225ga);
        h();
        m27986i();
        if (m28081Z(c4225ga.f10317a, c4225ga.f10319c) == null) {
            if (ia.W(c4225ga.f10319c)) {
                if (m28095L("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{c4225ga.f10317a}) >= ((v5) this).a.z().p(c4225ga.f10317a, C4173c3.f10095G, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(c4225ga.f10319c)) {
                long m28095L = m28095L("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{c4225ga.f10317a, c4225ga.f10318b});
                ((v5) this).a.z();
                if (m28095L >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", c4225ga.f10317a);
        contentValues.put("origin", c4225ga.f10318b);
        contentValues.put("name", c4225ga.f10319c);
        contentValues.put("set_timestamp", Long.valueOf(c4225ga.f10320d));
        m28097J(contentValues, "value", c4225ga.f10321e);
        try {
            if (m28089R().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                ((v5) this).a.b().r().m28013b("Failed to insert/update user property (got -1). appId", q3.z(c4225ga.f10317a));
            }
        } catch (SQLiteException e) {
            ((v5) this).a.b().r().m28012c("Error storing user property. appId", q3.z(c4225ga.f10317a), e);
        }
        return true;
    }
}
