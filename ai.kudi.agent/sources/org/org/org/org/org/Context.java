package org.org.org.org.org;

import java.util.Map;
import org.org.org.org.asm.menu.MenuItem;
/* loaded from: classes.dex */
public interface Context {
    Object add(String str, MenuItem menuItem);

    void add(long j, String str);

    void add(Object obj, String str);

    void add(Map map, String str);

    void clear();

    int get(String str, int i);

    long get(String str, long j);

    Integer get(String str);

    boolean get(String str, boolean z);

    String getProperty(String str, String str2);

    Map load(String str);

    void remove(int i, String str);

    void remove(String str);

    void remove(String str, String str2);

    void remove(boolean z, String str);

    String toString(String str);
}
