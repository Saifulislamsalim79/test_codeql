package io.intercom.android.sdk.blocks.models;

import android.os.Parcel;
import android.os.Parcelable;
import io.intercom.android.sdk.blocks.BlockType;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class Link implements Parcelable {
    public static final Parcelable.Creator<Link> CREATOR = new Parcelable.Creator<Link>() { // from class: io.intercom.android.sdk.blocks.models.Link.1
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Link createFromParcel(Parcel parcel) {
            Link $r2 = new Link(parcel);
            return $r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Link createFromParcel(Parcel parcel) {
            Link $r1 = createFromParcel(parcel);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Link[] newArray(int i) {
            Link[] $r1 = new Link[i];
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Link[] newArray(int i) {
            Link[] $r1 = newArray(i);
            return $r1;
        }
    };
    private final String articleId;
    private final Author author;
    private final Map<String, String> data;
    private final String description;
    private final Image image;
    private final String linkType;
    private final String siteName;
    private final String text;
    private final String title;
    private final BlockType type;
    private final String url;

    /* loaded from: classes.dex */
    public static final class Builder {
        String articleId;
        Author author;
        Map<String, String> data;
        String description;
        String fileName;
        Image image;
        String linkType;
        String siteName;
        String text;
        String title;
        String type;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        public Link build() {
            Link $r1 = new Link(this);
            return $r1;
        }

        public Builder withArticleId(String str) {
            this.articleId = str;
            return this;
        }

        public Builder withAuthor(Author author) {
            this.author = author;
            return this;
        }

        public Builder withData(Map map) {
            this.data = map;
            return this;
        }

        public Builder withDescription(String str) {
            this.description = str;
            return this;
        }

        public Builder withImage(Image image) {
            this.image = image;
            return this;
        }

        public Builder withLinkType(String str) {
            this.linkType = str;
            return this;
        }

        public Builder withSiteName(String str) {
            this.siteName = str;
            return this;
        }

        public Builder withText(String str) {
            this.text = str;
            return this;
        }

        public Builder withTitle(String str) {
            this.title = str;
            return this;
        }

        public Builder withType(String str) {
            this.type = str;
            return this;
        }

        public Builder withUrl(String str) {
            this.fileName = str;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Link() {
        /*
            r1 = this;
            io.intercom.android.sdk.blocks.models.Link$Builder r0 = new io.intercom.android.sdk.blocks.models.Link$Builder
            r0.<init>()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.blocks.models.Link.<init>():void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchDebugInfoByOffset(DebugInfoApplyVisitor.java:106)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:83)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
    	at java.util.ArrayList.forEach(ArrayList.java:1259)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    protected Link(Parcel parcel) {
        String $r3 = parcel.readString();
        BlockType $r4 = BlockType.typeValueOf($r3);
        this.type = $r4;
        String $r32 = parcel.readString();
        this.text = $r32;
        String $r33 = parcel.readString();
        this.title = $r33;
        String $r34 = parcel.readString();
        this.description = $r34;
        String $r35 = parcel.readString();
        this.linkType = $r35;
        String $r36 = parcel.readString();
        this.siteName = $r36;
        String $r37 = parcel.readString();
        this.articleId = $r37;
        String $r38 = parcel.readString();
        this.url = $r38;
        ClassLoader $r6 = Author.class.getClassLoader();
        Parcelable $r7 = parcel.readParcelable($r6);
        Author $r8 = (Author) $r7;
        this.author = $r8;
        ClassLoader $r62 = Image.class.getClassLoader();
        Parcelable $r72 = parcel.readParcelable($r62);
        Image $r9 = (Image) $r72;
        this.image = $r9;
        HashMap $r10 = new HashMap();
        this.data = $r10;
        int $i0 = parcel.readInt();
        for (int $i1 = 0; $i1 < $i0; $i1++) {
            String $r39 = parcel.readString();
            String $r11 = parcel.readString();
            Map $r2 = this.data;
            $r2.put($r39, $r11);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    private Link(Builder builder) {
        String $r3 = builder.type;
        BlockType $r1 = BlockType.typeValueOf($r3);
        this.type = $r1;
        String $r4 = builder.text;
        this.text = $r4 == null ? "" : $r4;
        String $r42 = builder.title;
        this.title = $r42 == null ? "" : $r42;
        String $r43 = builder.description;
        this.description = $r43 == null ? "" : $r43;
        String $r44 = builder.linkType;
        this.linkType = $r44 == null ? "" : $r44;
        String $r45 = builder.siteName;
        this.siteName = $r45 == null ? "" : $r45;
        String $r46 = builder.articleId;
        this.articleId = $r46 == null ? "" : $r46;
        Author $r5 = builder.author;
        if ($r5 == null) {
            $r5 = r8;
            Author r8 = new Author();
        }
        this.author = $r5;
        Image $r6 = builder.image;
        if ($r6 == null) {
            $r6 = r9;
            Image r9 = new Image();
        }
        this.image = $r6;
        Object $r7 = builder.data;
        if ($r7 == null) {
            $r7 = r10;
            Object r10 = new HashMap();
        }
        Map r11 = (Map) $r7;
        this.data = r11;
        String $r47 = builder.fileName;
        String $r32 = $r47 != null ? $r47 : "";
        this.url = $r32;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static Link fromBlock(Block block) {
        if (block == null) {
            Link $r2 = new Link();
            return $r2;
        }
        Builder $r0 = new Builder();
        BlockType $r3 = block.getType();
        String $r4 = $r3.name();
        $r0.type = $r4;
        String $r42 = block.getText();
        $r0.text = $r42;
        String $r43 = block.getTitle();
        $r0.title = $r43;
        String $r44 = block.getDescription();
        $r0.description = $r44;
        String $r45 = block.getLinkType();
        $r0.linkType = $r45;
        Author $r5 = block.getAuthor();
        $r0.author = $r5;
        Image $r6 = block.getImage();
        $r0.image = $r6;
        Map $r7 = block.getData();
        $r0.data = $r7;
        String $r46 = block.getSiteName();
        $r0.siteName = $r46;
        String $r47 = block.getArticleId();
        $r0.articleId = $r47;
        String $r48 = block.getUrl();
        $r0.fileName = $r48;
        Link $r22 = new Link($r0);
        return $r22;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            Class $r2 = obj.getClass();
            if (Link.class != $r2) {
                return false;
            }
            Link $r3 = (Link) obj;
            BlockType $r4 = this.type;
            BlockType $r5 = $r3.type;
            if ($r4 != $r5) {
                return false;
            }
            String $r6 = this.text;
            if ($r6 != null) {
                boolean $z0 = $r6.equals($r3.text);
                if (!$z0) {
                    return false;
                }
            } else if ($r3.text != null) {
                return false;
            }
            String $r62 = this.title;
            if ($r62 != null) {
                boolean $z02 = $r62.equals($r3.title);
                if (!$z02) {
                    return false;
                }
            } else if ($r3.title != null) {
                return false;
            }
            String $r63 = this.description;
            if ($r63 != null) {
                boolean $z03 = $r63.equals($r3.description);
                if (!$z03) {
                    return false;
                }
            } else if ($r3.description != null) {
                return false;
            }
            String $r64 = this.linkType;
            if ($r64 != null) {
                boolean $z04 = $r64.equals($r3.linkType);
                if (!$z04) {
                    return false;
                }
            } else if ($r3.linkType != null) {
                return false;
            }
            Author $r8 = this.author;
            if ($r8 != null) {
                Author $r9 = $r3.author;
                boolean $z05 = $r8.equals($r9);
                if (!$z05) {
                    return false;
                }
            } else if ($r3.author != null) {
                return false;
            }
            Image $r10 = this.image;
            if ($r10 != null) {
                Image $r11 = $r3.image;
                boolean $z06 = $r10.equals($r11);
                if (!$z06) {
                    return false;
                }
            } else if ($r3.image != null) {
                return false;
            }
            Map $r12 = this.data;
            if ($r12 != null) {
                Map $r13 = $r3.data;
                boolean $z07 = $r12.equals($r13);
                if (!$z07) {
                    return false;
                }
            } else if ($r3.data != null) {
                return false;
            }
            String $r65 = this.siteName;
            if ($r65 != null) {
                boolean $z08 = $r65.equals($r3.siteName);
                if (!$z08) {
                    return false;
                }
            } else if ($r3.siteName != null) {
                return false;
            }
            String $r66 = this.articleId;
            if ($r66 != null) {
                boolean $z09 = $r66.equals($r3.articleId);
                if (!$z09) {
                    return false;
                }
            } else if ($r3.articleId != null) {
                return false;
            }
            String $r67 = this.url;
            String $r7 = $r3.url;
            if ($r67 == null) {
                return $r7 == null;
            }
            boolean $z010 = $r67.equals($r7);
            return $z010;
        }
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public String getArticleId() {
        String r1 = this.articleId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public Author getAuthor() {
        Author r1 = this.author;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public Map getData() {
        Map r1 = this.data;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public String getDescription() {
        String r1 = this.description;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public Image getImage() {
        Image r1 = this.image;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public String getLinkType() {
        String r1 = this.linkType;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public String getSiteName() {
        String r1 = this.siteName;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public String getText() {
        String r1 = this.text;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public String getTitle() {
        String r1 = this.title;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public BlockType getType() {
        BlockType r1 = this.type;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public String getUrl() {
        String r1 = this.url;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchDebugInfoByOffset(DebugInfoApplyVisitor.java:106)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:83)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
    	at java.util.ArrayList.forEach(ArrayList.java:1259)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public int hashCode() {
        BlockType $r1 = this.type;
        int $i1 = $r1 != null ? $r1.hashCode() : 0;
        int $i12 = $i1 * 31;
        String $r2 = this.text;
        int $i2 = $r2 != null ? $r2.hashCode() : 0;
        int $i13 = ($i12 + $i2) * 31;
        String $r22 = this.title;
        int $i22 = $r22 != null ? $r22.hashCode() : 0;
        int $i14 = ($i13 + $i22) * 31;
        String $r23 = this.description;
        int $i23 = $r23 != null ? $r23.hashCode() : 0;
        int $i15 = ($i14 + $i23) * 31;
        String $r24 = this.linkType;
        int $i24 = $r24 != null ? $r24.hashCode() : 0;
        int $i16 = ($i15 + $i24) * 31;
        Author $r3 = this.author;
        int $i25 = $r3 != null ? $r3.hashCode() : 0;
        int $i17 = ($i16 + $i25) * 31;
        Image $r4 = this.image;
        int $i26 = $r4 != null ? $r4.hashCode() : 0;
        int $i18 = ($i17 + $i26) * 31;
        Map $r5 = this.data;
        int $i27 = $r5 != null ? $r5.hashCode() : 0;
        int $i19 = ($i18 + $i27) * 31;
        String $r25 = this.siteName;
        int $i28 = $r25 != null ? $r25.hashCode() : 0;
        int $i110 = ($i19 + $i28) * 31;
        String $r26 = this.articleId;
        int $i29 = $r26 != null ? $r26.hashCode() : 0;
        int $i111 = ($i110 + $i29) * 31;
        String $r27 = this.url;
        int $i0 = $r27 != null ? $r27.hashCode() : 0;
        return $i111 + $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("LinkCard{type=");
        BlockType $r3 = this.type;
        $r2.append($r3);
        $r2.append(", text='");
        String $r1 = this.text;
        $r2.append($r1);
        $r2.append('\'');
        $r2.append(", title='");
        String $r12 = this.title;
        $r2.append($r12);
        $r2.append('\'');
        $r2.append(", description='");
        String $r13 = this.description;
        $r2.append($r13);
        $r2.append('\'');
        $r2.append(", linkType='");
        String $r14 = this.linkType;
        $r2.append($r14);
        $r2.append('\'');
        $r2.append(", author=");
        Author $r4 = this.author;
        $r2.append($r4);
        $r2.append(", image=");
        Image $r5 = this.image;
        $r2.append($r5);
        $r2.append(", data=");
        Map $r6 = this.data;
        $r2.append($r6);
        $r2.append(", siteName='");
        String $r15 = this.siteName;
        $r2.append($r15);
        $r2.append('\'');
        $r2.append(", articleId='");
        String $r16 = this.articleId;
        $r2.append($r16);
        $r2.append('\'');
        $r2.append(", url='");
        String $r17 = this.url;
        $r2.append($r17);
        $r2.append('\'');
        $r2.append('}');
        String $r18 = $r2.toString();
        return $r18;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x004d */
    @Override // android.os.Parcelable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void writeToParcel(android.os.Parcel r14, int r15) {
        /*
            r13 = this;
            io.intercom.android.sdk.blocks.BlockType r0 = r13.type
            java.lang.String r1 = r0.name()
            r14.writeString(r1)
            java.lang.String r1 = r13.text
            r14.writeString(r1)
            java.lang.String r1 = r13.title
            r14.writeString(r1)
            java.lang.String r1 = r13.description
            r14.writeString(r1)
            java.lang.String r1 = r13.linkType
            r14.writeString(r1)
            java.lang.String r1 = r13.siteName
            r14.writeString(r1)
            java.lang.String r1 = r13.articleId
            r14.writeString(r1)
            java.lang.String r1 = r13.url
            r14.writeString(r1)
            io.intercom.android.sdk.blocks.models.Author r2 = r13.author
            r14.writeParcelable(r2, r15)
            io.intercom.android.sdk.blocks.models.Image r3 = r13.image
            r14.writeParcelable(r3, r15)
            java.util.Map<java.lang.String, java.lang.String> r4 = r13.data
            int r15 = r4.size()
            r14.writeInt(r15)
            java.util.Map<java.lang.String, java.lang.String> r4 = r13.data
            java.util.Set r5 = r4.entrySet()
            java.util.Iterator r6 = r5.iterator()
        L49:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L6e
            java.lang.Object r8 = r6.next()
            r10 = r8
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            r9 = r10
            java.lang.Object r8 = r9.getKey()
            r11 = r8
            java.lang.String r11 = (java.lang.String) r11
            r1 = r11
            r14.writeString(r1)
            java.lang.Object r8 = r9.getValue()
            r12 = r8
            java.lang.String r12 = (java.lang.String) r12
            r1 = r12
            r14.writeString(r1)
            goto L49
        L6e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.blocks.models.Link.writeToParcel(android.os.Parcel, int):void");
    }
}
