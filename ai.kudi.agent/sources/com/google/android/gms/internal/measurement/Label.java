package com.google.android.gms.internal.measurement;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* loaded from: classes.dex */
public final class Label implements Iterable<q>, q, m {

    /* renamed from: b */
    final Map<String, q> f9179b;

    /* renamed from: c */
    final SortedMap<Integer, q> f9180c;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public Label() {
        TreeMap $r1 = new TreeMap();
        this.f9180c = $r1;
        TreeMap $r12 = new TreeMap();
        this.f9179b = $r12;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:6:0x000a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Label(java.util.List r6) {
        /*
            r5 = this;
            r5.<init>()
            if (r6 == 0) goto L1a
            r0 = 0
        L6:
            int r1 = r6.size()
            if (r0 >= r1) goto L1a
            java.lang.Object r2 = r6.get(r0)
            r4 = r2
            com.google.android.gms.internal.measurement.Item r4 = (com.google.android.gms.internal.measurement.Item) r4
            r3 = r4
            r5.add(r0, r3)
            int r0 = r0 + 1
            goto L6
        L1a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.Label.<init>(java.util.List):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0013 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.measurement.Item m29861a() {
        /*
            r14 = this;
            com.google.android.gms.internal.measurement.Label r0 = new com.google.android.gms.internal.measurement.Label
            r0.<init>()
            java.util.SortedMap<java.lang.Integer, com.google.android.gms.internal.measurement.q> r1 = r14.f9180c
            java.util.Set r2 = r1.entrySet()
            java.util.Iterator r3 = r2.iterator()
        Lf:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L55
            java.lang.Object r5 = r3.next()
            r7 = r5
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            r6 = r7
            java.lang.Object r5 = r6.getValue()
            boolean r4 = r5 instanceof com.google.android.gms.internal.measurement.ByteVector
            if (r4 == 0) goto L3b
            java.util.SortedMap<java.lang.Integer, com.google.android.gms.internal.measurement.q> r1 = r0.f9180c
            java.lang.Object r5 = r6.getKey()
            r9 = r5
            java.lang.Integer r9 = (java.lang.Integer) r9
            r8 = r9
            java.lang.Object r5 = r6.getValue()
            r11 = r5
            com.google.android.gms.internal.measurement.Item r11 = (com.google.android.gms.internal.measurement.Item) r11
            r10 = r11
            r1.put(r8, r10)
            goto Lf
        L3b:
            java.util.SortedMap<java.lang.Integer, com.google.android.gms.internal.measurement.q> r1 = r0.f9180c
            java.lang.Object r5 = r6.getKey()
            r12 = r5
            java.lang.Integer r12 = (java.lang.Integer) r12
            r8 = r12
            java.lang.Object r5 = r6.getValue()
            r13 = r5
            com.google.android.gms.internal.measurement.Item r13 = (com.google.android.gms.internal.measurement.Item) r13
            r10 = r13
            com.google.android.gms.internal.measurement.Item r10 = r10.m29863a()
            r1.put(r8, r10)
            goto Lf
        L55:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.Label.m29861a():com.google.android.gms.internal.measurement.Item");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final Item m29859a(String str) {
        boolean $z0 = "length".equals(str);
        if ($z0) {
            int $i0 = next();
            double $d0 = $i0;
            Double $r4 = Double.valueOf($d0);
            C3822i r8 = new C3822i($r4);
            return (Item) r8;
        }
        boolean $z02 = put(str);
        if ($z02) {
            Map $r5 = this.f9179b;
            Object $r6 = $r5.get(str);
            Item $r7 = (Item) $r6;
            if ($r7 != null) {
                return $r7;
            }
        }
        return Item.f9172c;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final void m29860a(int i, Item item) {
        if (i < 0) {
            StringBuilder $r7 = new StringBuilder(32);
            $r7.append("Invalid value index: ");
            $r7.append(i);
            String $r8 = $r7.toString();
            IllegalArgumentException $r6 = new IllegalArgumentException($r8);
            throw $r6;
        }
        int $i0 = next();
        if (i >= $i0) {
            add(i, item);
            return;
        }
        SortedMap $r2 = this.f9180c;
        Object $r3 = $r2.lastKey();
        for (int $i2 = ((Integer) $r3).intValue(); $i2 >= i; $i2--) {
            SortedMap $r22 = this.f9180c;
            Object $r4 = Integer.valueOf($i2);
            Object $r32 = $r22.get($r4);
            Item $r5 = (Item) $r32;
            if ($r5 != null) {
                int $i02 = $i2 + 1;
                add($i02, $r5);
                SortedMap $r23 = this.f9180c;
                $r23.remove($r4);
            }
        }
        add(i, item);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Double add() {
        SortedMap $r1 = this.f9180c;
        int $i0 = $r1.size();
        if ($i0 == 1) {
            Item $r2 = get(0);
            Double $r3 = $r2.add();
            return $r3;
        }
        SortedMap $r12 = this.f9180c;
        int $i02 = $r12.size();
        if ($i02 <= 0) {
            Double $r32 = Double.valueOf(0.0d);
            return $r32;
        }
        Double $r33 = Double.valueOf(Double.NaN);
        return $r33;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void add(int i, Item item) {
        if (i > 32468) {
            IllegalStateException $r7 = new IllegalStateException("Array too large");
            throw $r7;
        } else if (i < 0) {
            StringBuilder $r5 = new StringBuilder(32);
            $r5.append("Out of bounds index: ");
            $r5.append(i);
            String $r6 = $r5.toString();
            IndexOutOfBoundsException $r4 = new IndexOutOfBoundsException($r6);
            throw $r4;
        } else if (item == null) {
            SortedMap $r2 = this.f9180c;
            Integer $r3 = Integer.valueOf(i);
            $r2.remove($r3);
        } else {
            SortedMap $r22 = this.f9180c;
            Integer $r32 = Integer.valueOf(i);
            $r22.put($r32, item);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean add(int i) {
        if (i >= 0) {
            SortedMap $r2 = this.f9180c;
            Object $r3 = $r2.lastKey();
            Integer $r4 = (Integer) $r3;
            int $i1 = $r4.intValue();
            if (i <= $i1) {
                SortedMap $r22 = this.f9180c;
                Integer $r42 = Integer.valueOf(i);
                boolean $z0 = $r22.containsKey($r42);
                return $z0;
            }
        }
        StringBuilder $r1 = new StringBuilder(32);
        $r1.append("Out of bounds index: ");
        $r1.append(i);
        String $r6 = $r1.toString();
        IndexOutOfBoundsException $r5 = new IndexOutOfBoundsException($r6);
        throw $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public final Iterator m29858b() {
        SortedMap $r2 = this.f9180c;
        Set $r3 = $r2.keySet();
        Iterator $r4 = $r3.iterator();
        Map $r5 = this.f9179b;
        Set $r32 = $r5.keySet();
        Iterator $r6 = $r32.iterator();
        Iterator r7 = new C3745d(this, $r4, $r6);
        Iterator $r42 = r7;
        return $r42;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Boolean delete() {
        Boolean r1 = Boolean.TRUE;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void draw() {
        SortedMap $r1 = this.f9180c;
        $r1.clear();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void draw(int $i0) {
        SortedMap $r1 = this.f9180c;
        Object $r2 = $r1.lastKey();
        Integer $r3 = (Integer) $r2;
        int $i1 = $r3.intValue();
        if ($i0 > $i1 || $i0 < 0) {
            return;
        }
        SortedMap $r12 = this.f9180c;
        Integer $r32 = Integer.valueOf($i0);
        $r12.remove($r32);
        if ($i0 == $i1) {
            SortedMap $r13 = this.f9180c;
            int $i02 = $i0 - 1;
            Integer $r33 = Integer.valueOf($i02);
            boolean $z0 = $r13.containsKey($r33);
            if ($z0 || $i02 < 0) {
                return;
            }
            SortedMap $r14 = this.f9180c;
            Item $r4 = Item.f9172c;
            $r14.put($r33, $r4);
            return;
        }
        while (true) {
            $i0++;
            SortedMap $r15 = this.f9180c;
            Object $r22 = $r15.lastKey();
            Integer $r34 = (Integer) $r22;
            if ($i0 > $r34.intValue()) {
                return;
            }
            SortedMap $r16 = this.f9180c;
            Object $r35 = Integer.valueOf($i0);
            Object $r23 = $r16.get($r35);
            q qVar = (Item) $r23;
            if (qVar != null) {
                SortedMap $r17 = this.f9180c;
                Integer $r5 = Integer.valueOf($i0 - 1);
                $r17.put($r5, qVar);
                SortedMap $r18 = this.f9180c;
                $r18.remove($r35);
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        boolean $z0 = obj instanceof Label;
        if (!$z0) {
            return false;
        }
        Label $r2 = (Label) obj;
        int $i0 = next();
        int $i1 = $r2.next();
        if ($i0 != $i1) {
            return false;
        }
        SortedMap $r3 = this.f9180c;
        boolean $z02 = $r3.isEmpty();
        if ($z02) {
            SortedMap $r32 = $r2.f9180c;
            boolean $z03 = $r32.isEmpty();
            return $z03;
        }
        SortedMap $r33 = this.f9180c;
        Object $r1 = $r33.firstKey();
        Integer $r4 = (Integer) $r1;
        int $i02 = $r4.intValue();
        while (true) {
            SortedMap $r34 = this.f9180c;
            Object $r12 = $r34.lastKey();
            Integer $r42 = (Integer) $r12;
            int $i12 = $r42.intValue();
            if ($i02 > $i12) {
                return true;
            }
            Item $r5 = get($i02);
            Item $r6 = $r2.get($i02);
            boolean $z04 = $r5.equals($r6);
            if (!$z04) {
                return false;
            }
            $i02++;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Item get(int i) {
        int $i1 = next();
        if (i >= $i1) {
            IndexOutOfBoundsException $r5 = new IndexOutOfBoundsException("Attempting to get element outside of current array");
            throw $r5;
        }
        boolean $z0 = add(i);
        if ($z0) {
            SortedMap $r1 = this.f9180c;
            Integer $r2 = Integer.valueOf(i);
            Object $r3 = $r1.get($r2);
            Item $r4 = (Item) $r3;
            if ($r4 != null) {
                return $r4;
            }
        }
        return Item.f9172c;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getKey() {
        String $r1 = toString(",");
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Iterator getNames() {
        SortedMap $r1 = this.f9180c;
        Set $r2 = $r1.keySet();
        Iterator $r3 = $r2.iterator();
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final int getOffset() {
        SortedMap $r1 = this.f9180c;
        int $i0 = $r1.size();
        return $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x000e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List getPaths() {
        /*
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r4.next()
            r0.<init>(r1)
            r1 = 0
        La:
            int r2 = r4.next()
            if (r1 >= r2) goto L1a
            com.google.android.gms.internal.measurement.Item r3 = r4.get(r1)
            r0.add(r3)
            int r1 = r1 + 1
            goto La
        L1a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.Label.getPaths():java.util.List");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final int hashCode() {
        SortedMap $r1 = this.f9180c;
        int $i0 = $r1.hashCode();
        return $i0 * 31;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Item initPrototypeId(String str, C3968r4 c3968r4, List list) {
        boolean $z0 = "concat".equals(str);
        if (!$z0) {
            boolean $z02 = "every".equals(str);
            if (!$z02) {
                boolean $z03 = "filter".equals(str);
                if (!$z03) {
                    boolean $z04 = "forEach".equals(str);
                    if (!$z04) {
                        boolean $z05 = "indexOf".equals(str);
                        if (!$z05) {
                            boolean $z06 = "join".equals(str);
                            if (!$z06) {
                                boolean $z07 = "lastIndexOf".equals(str);
                                if (!$z07) {
                                    boolean $z08 = "map".equals(str);
                                    if (!$z08) {
                                        boolean $z09 = "pop".equals(str);
                                        if (!$z09) {
                                            boolean $z010 = MetricTracker.Place.PUSH.equals(str);
                                            if (!$z010) {
                                                boolean $z011 = "reduce".equals(str);
                                                if (!$z011) {
                                                    boolean $z012 = "reduceRight".equals(str);
                                                    if (!$z012) {
                                                        boolean $z013 = "reverse".equals(str);
                                                        if (!$z013) {
                                                            boolean $z014 = "shift".equals(str);
                                                            if (!$z014) {
                                                                boolean $z015 = "slice".equals(str);
                                                                if (!$z015) {
                                                                    boolean $z016 = "some".equals(str);
                                                                    if (!$z016) {
                                                                        boolean $z017 = "sort".equals(str);
                                                                        if (!$z017) {
                                                                            boolean $z018 = "splice".equals(str);
                                                                            if (!$z018) {
                                                                                boolean $z019 = "toString".equals(str);
                                                                                if (!$z019) {
                                                                                    boolean $z020 = "unshift".equals(str);
                                                                                    if (!$z020) {
                                                                                        C4011u r7 = new C4011u(str);
                                                                                        Item $r6 = (Item) r7;
                                                                                        return C3854k.a(this, $r6, c3968r4, list);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        Item $r62 = C3746d0.a(str, this, c3968r4, list);
        return $r62;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // java.lang.Iterable
    public final Iterator<q> iterator() {
        Iterator r2 = new C3761e(this);
        Iterator r3 = r2;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final int next() {
        SortedMap $r1 = this.f9180c;
        boolean $z0 = $r1.isEmpty();
        if ($z0) {
            return 0;
        }
        SortedMap $r12 = this.f9180c;
        Object $r2 = $r12.lastKey();
        Integer $r3 = (Integer) $r2;
        int $i0 = $r3.intValue();
        return $i0 + 1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void put(String str, Item item) {
        if (item == null) {
            Map $r2 = this.f9179b;
            $r2.remove(str);
            return;
        }
        Map $r22 = this.f9179b;
        $r22.put(str, item);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean put(String str) {
        boolean $z0 = "length".equals(str);
        if ($z0) {
            return true;
        }
        Map $r3 = this.f9179b;
        boolean $z02 = $r3.containsKey(str);
        return $z02;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String toString() {
        String $r1 = toString(",");
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:8:0x0016 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString(java.lang.String r9) {
        /*
            r8 = this;
            if (r9 != 0) goto L4
            java.lang.String r9 = ""
        L4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.SortedMap<java.lang.Integer, com.google.android.gms.internal.measurement.q> r1 = r8.f9180c
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L39
            r3 = 0
        L12:
            int r4 = r8.next()
            if (r3 >= r4) goto L31
            com.google.android.gms.internal.measurement.Item r5 = r8.get(r3)
            r0.append(r9)
            boolean r2 = r5 instanceof com.google.android.gms.internal.measurement.C4027v
            if (r2 != 0) goto L2e
            boolean r2 = r5 instanceof com.google.android.gms.internal.measurement.C3917o
            if (r2 != 0) goto L2e
            java.lang.String r6 = r5.getKey()
            r0.append(r6)
        L2e:
            int r3 = r3 + 1
            goto L12
        L31:
            int r3 = r9.length()
            r7 = 0
            r0.delete(r7, r3)
        L39:
            java.lang.String r9 = r0.toString()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.Label.toString(java.lang.String):java.lang.String");
    }
}
