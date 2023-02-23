package androidx.room.p063z0;

import android.database.Cursor;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import p201g.p262t.p263a.InterfaceC8093g;
/* compiled from: TableInfo.java */
/* renamed from: androidx.room.z0.g */
/* loaded from: classes2.dex */
public final class C1858g {

    /* renamed from: a */
    public final String f5627a;

    /* renamed from: b */
    public final Map<String, C1859a> f5628b;

    /* renamed from: c */
    public final Set<C1860b> f5629c;

    /* renamed from: d */
    public final Set<C1862d> f5630d;

    /* compiled from: TableInfo.java */
    /* renamed from: androidx.room.z0.g$a */
    /* loaded from: classes2.dex */
    public static final class C1859a {

        /* renamed from: a */
        public final String f5631a;

        /* renamed from: b */
        public final String f5632b;

        /* renamed from: c */
        public final int f5633c;

        /* renamed from: d */
        public final boolean f5634d;

        /* renamed from: e */
        public final int f5635e;

        /* renamed from: f */
        public final String f5636f;

        /* renamed from: g */
        private final int f5637g;

        public C1859a(String str, String str2, boolean z, int i, String str3, int i2) {
            this.f5631a = str;
            this.f5632b = str2;
            this.f5634d = z;
            this.f5635e = i;
            this.f5633c = m34404c(str2);
            this.f5636f = str3;
            this.f5637g = i2;
        }

        /* renamed from: a */
        private static boolean m34406a(String str) {
            if (str.length() == 0) {
                return false;
            }
            int i = 0;
            for (int i2 = 0; i2 < str.length(); i2++) {
                char charAt = str.charAt(i2);
                if (i2 == 0 && charAt != '(') {
                    return false;
                }
                if (charAt == '(') {
                    i++;
                } else if (charAt == ')' && i - 1 == 0 && i2 != str.length() - 1) {
                    return false;
                }
            }
            return i == 0;
        }

        /* renamed from: b */
        public static boolean m34405b(String str, String str2) {
            if (str2 == null) {
                return false;
            }
            if (str.equals(str2)) {
                return true;
            }
            if (m34406a(str)) {
                return str.substring(1, str.length() - 1).trim().equals(str2);
            }
            return false;
        }

        /* renamed from: c */
        private static int m34404c(String str) {
            if (str == null) {
                return 5;
            }
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                return 3;
            }
            if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                return 2;
            }
            if (upperCase.contains("BLOB")) {
                return 5;
            }
            return (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
        }

        /* renamed from: d */
        public boolean m34403d() {
            return this.f5635e > 0;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (obj instanceof C1859a) {
                C1859a c1859a = (C1859a) obj;
                if (Build.VERSION.SDK_INT >= 20) {
                    if (this.f5635e != c1859a.f5635e) {
                        return false;
                    }
                } else if (m34403d() != c1859a.m34403d()) {
                    return false;
                }
                if (this.f5631a.equals(c1859a.f5631a) && this.f5634d == c1859a.f5634d) {
                    if (this.f5637g != 1 || c1859a.f5637g != 2 || (str3 = this.f5636f) == null || m34405b(str3, c1859a.f5636f)) {
                        if (this.f5637g != 2 || c1859a.f5637g != 1 || (str2 = c1859a.f5636f) == null || m34405b(str2, this.f5636f)) {
                            int i = this.f5637g;
                            return (i == 0 || i != c1859a.f5637g || ((str = this.f5636f) == null ? c1859a.f5636f == null : m34405b(str, c1859a.f5636f))) && this.f5633c == c1859a.f5633c;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f5631a.hashCode() * 31) + this.f5633c) * 31) + (this.f5634d ? 1231 : 1237)) * 31) + this.f5635e;
        }

        public String toString() {
            return "Column{name='" + this.f5631a + "', type='" + this.f5632b + "', affinity='" + this.f5633c + "', notNull=" + this.f5634d + ", primaryKeyPosition=" + this.f5635e + ", defaultValue='" + this.f5636f + "'}";
        }
    }

    /* compiled from: TableInfo.java */
    /* renamed from: androidx.room.z0.g$b */
    /* loaded from: classes2.dex */
    public static final class C1860b {

        /* renamed from: a */
        public final String f5638a;

        /* renamed from: b */
        public final String f5639b;

        /* renamed from: c */
        public final String f5640c;

        /* renamed from: d */
        public final List<String> f5641d;

        /* renamed from: e */
        public final List<String> f5642e;

        public C1860b(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.f5638a = str;
            this.f5639b = str2;
            this.f5640c = str3;
            this.f5641d = Collections.unmodifiableList(list);
            this.f5642e = Collections.unmodifiableList(list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C1860b) {
                C1860b c1860b = (C1860b) obj;
                if (this.f5638a.equals(c1860b.f5638a) && this.f5639b.equals(c1860b.f5639b) && this.f5640c.equals(c1860b.f5640c) && this.f5641d.equals(c1860b.f5641d)) {
                    return this.f5642e.equals(c1860b.f5642e);
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f5638a.hashCode() * 31) + this.f5639b.hashCode()) * 31) + this.f5640c.hashCode()) * 31) + this.f5641d.hashCode()) * 31) + this.f5642e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.f5638a + "', onDelete='" + this.f5639b + "', onUpdate='" + this.f5640c + "', columnNames=" + this.f5641d + ", referenceColumnNames=" + this.f5642e + '}';
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TableInfo.java */
    /* renamed from: androidx.room.z0.g$c */
    /* loaded from: classes2.dex */
    public static class C1861c implements Comparable<C1861c> {

        /* renamed from: c */
        final int f5643c;

        /* renamed from: d */
        final int f5644d;

        /* renamed from: e */
        final String f5645e;

        /* renamed from: f */
        final String f5646f;

        C1861c(int i, int i2, String str, String str2) {
            this.f5643c = i;
            this.f5644d = i2;
            this.f5645e = str;
            this.f5646f = str2;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(C1861c c1861c) {
            int i = this.f5643c - c1861c.f5643c;
            return i == 0 ? this.f5644d - c1861c.f5644d : i;
        }
    }

    /* compiled from: TableInfo.java */
    /* renamed from: androidx.room.z0.g$d */
    /* loaded from: classes2.dex */
    public static final class C1862d {

        /* renamed from: a */
        public final String f5647a;

        /* renamed from: b */
        public final boolean f5648b;

        /* renamed from: c */
        public final List<String> f5649c;

        public C1862d(String str, boolean z, List<String> list) {
            this.f5647a = str;
            this.f5648b = z;
            this.f5649c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C1862d) {
                C1862d c1862d = (C1862d) obj;
                if (this.f5648b == c1862d.f5648b && this.f5649c.equals(c1862d.f5649c)) {
                    if (this.f5647a.startsWith("index_")) {
                        return c1862d.f5647a.startsWith("index_");
                    }
                    return this.f5647a.equals(c1862d.f5647a);
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            return ((((this.f5647a.startsWith("index_") ? -1184239155 : this.f5647a.hashCode()) * 31) + (this.f5648b ? 1 : 0)) * 31) + this.f5649c.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.f5647a + "', unique=" + this.f5648b + ", columns=" + this.f5649c + '}';
        }
    }

    public C1858g(String str, Map<String, C1859a> map, Set<C1860b> set, Set<C1862d> set2) {
        this.f5627a = str;
        this.f5628b = Collections.unmodifiableMap(map);
        this.f5629c = Collections.unmodifiableSet(set);
        this.f5630d = set2 == null ? null : Collections.unmodifiableSet(set2);
    }

    /* renamed from: a */
    public static C1858g m34412a(InterfaceC8093g interfaceC8093g, String str) {
        return new C1858g(str, m34411b(interfaceC8093g, str), m34409d(interfaceC8093g, str), m34407f(interfaceC8093g, str));
    }

    /* renamed from: b */
    private static Map<String, C1859a> m34411b(InterfaceC8093g interfaceC8093g, String str) {
        Cursor mo16750j0 = interfaceC8093g.mo16750j0("PRAGMA table_info(`" + str + "`)");
        HashMap hashMap = new HashMap();
        try {
            if (mo16750j0.getColumnCount() > 0) {
                int columnIndex = mo16750j0.getColumnIndex("name");
                int columnIndex2 = mo16750j0.getColumnIndex("type");
                int columnIndex3 = mo16750j0.getColumnIndex("notnull");
                int columnIndex4 = mo16750j0.getColumnIndex("pk");
                int columnIndex5 = mo16750j0.getColumnIndex("dflt_value");
                while (mo16750j0.moveToNext()) {
                    String string = mo16750j0.getString(columnIndex);
                    hashMap.put(string, new C1859a(string, mo16750j0.getString(columnIndex2), mo16750j0.getInt(columnIndex3) != 0, mo16750j0.getInt(columnIndex4), mo16750j0.getString(columnIndex5), 2));
                }
            }
            return hashMap;
        } finally {
            mo16750j0.close();
        }
    }

    /* renamed from: c */
    private static List<C1861c> m34410c(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < count; i++) {
            cursor.moveToPosition(i);
            arrayList.add(new C1861c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: d */
    private static Set<C1860b> m34409d(InterfaceC8093g interfaceC8093g, String str) {
        HashSet hashSet = new HashSet();
        Cursor mo16750j0 = interfaceC8093g.mo16750j0("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = mo16750j0.getColumnIndex("id");
            int columnIndex2 = mo16750j0.getColumnIndex("seq");
            int columnIndex3 = mo16750j0.getColumnIndex("table");
            int columnIndex4 = mo16750j0.getColumnIndex("on_delete");
            int columnIndex5 = mo16750j0.getColumnIndex("on_update");
            List<C1861c> m34410c = m34410c(mo16750j0);
            int count = mo16750j0.getCount();
            for (int i = 0; i < count; i++) {
                mo16750j0.moveToPosition(i);
                if (mo16750j0.getInt(columnIndex2) == 0) {
                    int i2 = mo16750j0.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (C1861c c1861c : m34410c) {
                        if (c1861c.f5643c == i2) {
                            arrayList.add(c1861c.f5645e);
                            arrayList2.add(c1861c.f5646f);
                        }
                    }
                    hashSet.add(new C1860b(mo16750j0.getString(columnIndex3), mo16750j0.getString(columnIndex4), mo16750j0.getString(columnIndex5), arrayList, arrayList2));
                }
            }
            return hashSet;
        } finally {
            mo16750j0.close();
        }
    }

    /* renamed from: e */
    private static C1862d m34408e(InterfaceC8093g interfaceC8093g, String str, boolean z) {
        Cursor mo16750j0 = interfaceC8093g.mo16750j0("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = mo16750j0.getColumnIndex("seqno");
            int columnIndex2 = mo16750j0.getColumnIndex("cid");
            int columnIndex3 = mo16750j0.getColumnIndex("name");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                TreeMap treeMap = new TreeMap();
                while (mo16750j0.moveToNext()) {
                    if (mo16750j0.getInt(columnIndex2) >= 0) {
                        int i = mo16750j0.getInt(columnIndex);
                        treeMap.put(Integer.valueOf(i), mo16750j0.getString(columnIndex3));
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                return new C1862d(str, z, arrayList);
            }
            return null;
        } finally {
            mo16750j0.close();
        }
    }

    /* renamed from: f */
    private static Set<C1862d> m34407f(InterfaceC8093g interfaceC8093g, String str) {
        Cursor mo16750j0 = interfaceC8093g.mo16750j0("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = mo16750j0.getColumnIndex("name");
            int columnIndex2 = mo16750j0.getColumnIndex("origin");
            int columnIndex3 = mo16750j0.getColumnIndex("unique");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                HashSet hashSet = new HashSet();
                while (mo16750j0.moveToNext()) {
                    if ("c".equals(mo16750j0.getString(columnIndex2))) {
                        String string = mo16750j0.getString(columnIndex);
                        boolean z = true;
                        if (mo16750j0.getInt(columnIndex3) != 1) {
                            z = false;
                        }
                        C1862d m34408e = m34408e(interfaceC8093g, string, z);
                        if (m34408e == null) {
                            return null;
                        }
                        hashSet.add(m34408e);
                    }
                }
                return hashSet;
            }
            return null;
        } finally {
            mo16750j0.close();
        }
    }

    public boolean equals(Object obj) {
        Set<C1862d> set;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1858g) {
            C1858g c1858g = (C1858g) obj;
            String str = this.f5627a;
            if (str == null ? c1858g.f5627a == null : str.equals(c1858g.f5627a)) {
                Map<String, C1859a> map = this.f5628b;
                if (map == null ? c1858g.f5628b == null : map.equals(c1858g.f5628b)) {
                    Set<C1860b> set2 = this.f5629c;
                    if (set2 == null ? c1858g.f5629c == null : set2.equals(c1858g.f5629c)) {
                        Set<C1862d> set3 = this.f5630d;
                        if (set3 == null || (set = c1858g.f5630d) == null) {
                            return true;
                        }
                        return set3.equals(set);
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f5627a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, C1859a> map = this.f5628b;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set<C1860b> set = this.f5629c;
        return hashCode2 + (set != null ? set.hashCode() : 0);
    }

    public String toString() {
        return "TableInfo{name='" + this.f5627a + "', columns=" + this.f5628b + ", foreignKeys=" + this.f5629c + ", indices=" + this.f5630d + '}';
    }
}
