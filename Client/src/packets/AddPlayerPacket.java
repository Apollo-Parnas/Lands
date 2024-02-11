package packets;

import java.io.Serializable;

public class AddPlayerPacket implements Serializable {
    private static final long serialVersionID = 1L;

    public int id;
    public String name;

}
