package io.intercom.android.sdk.package_2;

import android.content.SharedPreferences;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.commons.utilities.TimeProvider;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.com.google.gson.C10916e;
import io.intercom.com.google.gson.JsonSyntaxException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class DeDuper {
    private static final String CUSTOM_ATTRIBUTES = "custom_attributes";
    private static final String EMPTY_JSON = "{}";
    private static final String PREFS_CACHED_ATTRIBUTES = "CachedAttributes";
    private static final String PREFS_EARLIEST_UPDATE_AT = "EarliestUpdateAt";
    private final Provider<AppConfig> appConfigProvider;
    private final Map<String, Object> cachedAttributes;
    private long earliestUpdateAt;
    private final C10916e gson;
    private final SharedPreferences prefs;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public DeDuper(Provider provider, SharedPreferences sharedPreferences) {
        HashMap $r3 = new HashMap();
        this.cachedAttributes = $r3;
        C10916e $r4 = new C10916e();
        this.gson = $r4;
        this.earliestUpdateAt = 0L;
        this.appConfigProvider = provider;
        this.prefs = sharedPreferences;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private static boolean containsOnlyEmptyCustomAttributes(Map map) {
        int $i0 = map.size();
        if ($i0 == 1) {
            Map $r1 = Collections.EMPTY_MAP;
            Object $r2 = map.get(CUSTOM_ATTRIBUTES);
            boolean $z0 = $r1.equals($r2);
            return $z0;
        }
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private static Map getCustomAttributes(Map map) {
        Object $r0 = map.get(CUSTOM_ATTRIBUTES);
        boolean $z0 = $r0 instanceof Map;
        if ($z0) {
            Map $r1 = (Map) $r0;
            return $r1;
        }
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private boolean hasExpiredCache() {
        long $l0 = this.earliestUpdateAt;
        if ($l0 == 0) {
            return false;
        }
        Provider $r1 = this.appConfigProvider;
        Object $r2 = $r1.get();
        AppConfig $r3 = (AppConfig) $r2;
        long $l02 = $r3.getUserUpdateCacheMaxAgeMs();
        TimeProvider $r4 = TimeProvider.SYSTEM;
        long $l2 = $r4.currentTimeMillis();
        long $l3 = this.earliestUpdateAt;
        return $l2 - $l3 > $l02;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:18:0x0048 */
    /* JADX WARN: Incorrect condition in loop: B:9:0x001c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean hasNewAttributeValues(java.util.Map r13) {
        /*
            r12 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r12.cachedAttributes
            java.util.Map r0 = getCustomAttributes(r0)
            java.util.Map r1 = getCustomAttributes(r13)
            if (r1 == 0) goto L3c
            if (r0 != 0) goto L10
            r2 = 1
            return r2
        L10:
            java.util.Set r3 = r1.entrySet()
            java.util.Iterator r4 = r3.iterator()
        L18:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L3c
            java.lang.Object r6 = r4.next()
            r8 = r6
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            r7 = r8
            java.lang.Object r6 = r7.getValue()
            if (r6 == 0) goto L18
            java.lang.Object r9 = r7.getKey()
            java.lang.Object r9 = r0.get(r9)
            boolean r5 = r6.equals(r9)
            if (r5 != 0) goto L18
            r2 = 1
            return r2
        L3c:
            java.util.Set r3 = r13.entrySet()
            java.util.Iterator r4 = r3.iterator()
        L44:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L77
            java.lang.Object r6 = r4.next()
            r10 = r6
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            r7 = r10
            java.lang.Object r6 = r7.getKey()
            java.lang.String r11 = "custom_attributes"
            boolean r5 = r11.equals(r6)
            if (r5 == 0) goto L5f
            goto L44
        L5f:
            java.lang.Object r6 = r7.getValue()
            if (r6 == 0) goto L44
            java.util.Map<java.lang.String, java.lang.Object> r13 = r12.cachedAttributes
            java.lang.Object r9 = r7.getKey()
            java.lang.Object r9 = r13.get(r9)
            boolean r5 = r6.equals(r9)
            if (r5 != 0) goto L44
            r2 = 1
            return r2
        L77:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.package_2.DeDuper.hasNewAttributeValues(java.util.Map):boolean");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private boolean isEmpty() {
        Map $r1 = this.cachedAttributes;
        boolean $z0 = $r1.isEmpty();
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private static Map mergeMaps(Map map, Map map2) {
        HashMap $r2 = new HashMap(map);
        $r2.putAll(map2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void persistCachedAttributes() {
        Map $r2 = this.cachedAttributes;
        HashMap $r1 = new HashMap($r2);
        SharedPreferences $r3 = this.prefs;
        SharedPreferences.Editor $r4 = $r3.edit();
        C10916e $r5 = this.gson;
        String $r6 = $r5.m11952s($r1);
        SharedPreferences.Editor $r42 = $r4.putString(PREFS_CACHED_ATTRIBUTES, $r6);
        long $l0 = this.earliestUpdateAt;
        $r42.putLong(PREFS_EARLIEST_UPDATE_AT, $l0).apply();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    long getEarliestUpdateAt() {
        long l0 = this.earliestUpdateAt;
        return l0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    Map getMap() {
        Map r1 = this.cachedAttributes;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void readPersistedCachedAttributes() {
        SharedPreferences $r2 = this.prefs;
        boolean $z0 = $r2.contains(PREFS_CACHED_ATTRIBUTES);
        if ($z0) {
            SharedPreferences $r22 = this.prefs;
            boolean $z02 = $r22.contains(PREFS_EARLIEST_UPDATE_AT);
            if ($z02) {
                SharedPreferences $r23 = this.prefs;
                String $r3 = $r23.getString(PREFS_CACHED_ATTRIBUTES, EMPTY_JSON);
                C10916e $r4 = this.gson;
                try {
                    Object $r5 = $r4.m11961j($r3, Map.class);
                    Map $r6 = (Map) $r5;
                    Map $r7 = this.cachedAttributes;
                    $r7.putAll($r6);
                    SharedPreferences $r24 = this.prefs;
                    long $l0 = $r24.getLong(PREFS_EARLIEST_UPDATE_AT, 0L);
                    this.earliestUpdateAt = $l0;
                } catch (JsonSyntaxException e) {
                }
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void reset() {
        Map $r1 = this.cachedAttributes;
        $r1.clear();
        this.earliestUpdateAt = 0L;
        persistCachedAttributes();
    }

    void setEarliestUpdateAt(long j) {
        this.earliestUpdateAt = j;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean shouldUpdateUser(Map map) {
        boolean $z0 = map.isEmpty();
        if ($z0) {
            return false;
        }
        boolean $z02 = containsOnlyEmptyCustomAttributes(map);
        if ($z02) {
            return false;
        }
        boolean $z03 = hasNewAttributeValues(map);
        if ($z03) {
            return true;
        }
        boolean $z04 = isEmpty();
        if ($z04) {
            return true;
        }
        boolean $z05 = hasExpiredCache();
        return $z05;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void update(Map map) {
        boolean $z0 = hasExpiredCache();
        if ($z0) {
            this.cachedAttributes.clear();
            TimeProvider $r3 = TimeProvider.SYSTEM;
            long $l1 = $r3.currentTimeMillis();
            setEarliestUpdateAt($l1);
        }
        long $l12 = this.earliestUpdateAt;
        if ($l12 == 0) {
            TimeProvider $r32 = TimeProvider.SYSTEM;
            long $l13 = $r32.currentTimeMillis();
            setEarliestUpdateAt($l13);
        }
        Map $r2 = getCustomAttributes(this.cachedAttributes);
        Map $r4 = getCustomAttributes(map);
        Map $r5 = this.cachedAttributes;
        $r5.putAll(map);
        if ($r2 != null && $r4 != null) {
            Map $r1 = this.cachedAttributes;
            $r1.put(CUSTOM_ATTRIBUTES, mergeMaps($r2, $r4));
        }
        persistCachedAttributes();
    }
}
