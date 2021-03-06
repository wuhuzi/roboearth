/* Auto-generated by genmsg_java.py for file /opt/ros/fuerte/stacks/arm_navigation/arm_navigation_msgs/msg/MakeStaticCollisionMapActionGoal.msg */

package ros.pkg.arm_navigation_msgs.msg;

import java.nio.ByteBuffer;

public class MakeStaticCollisionMapActionGoal extends ros.communication.Message {

  public ros.pkg.std_msgs.msg.Header header = new ros.pkg.std_msgs.msg.Header();
  public ros.pkg.actionlib_msgs.msg.GoalID goal_id = new ros.pkg.actionlib_msgs.msg.GoalID();
  public ros.pkg.arm_navigation_msgs.msg.MakeStaticCollisionMapGoal goal = new ros.pkg.arm_navigation_msgs.msg.MakeStaticCollisionMapGoal();

  public MakeStaticCollisionMapActionGoal() {
  }

  public static java.lang.String __s_getDataType() { return "arm_navigation_msgs/MakeStaticCollisionMapActionGoal"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "9233244d249847c9ee000cb0fccbaf8e"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "# ====== DO NOT MODIFY! AUTOGENERATED FROM AN ACTION DEFINITION ======\n" +
"\n" +
"Header header\n" +
"actionlib_msgs/GoalID goal_id\n" +
"MakeStaticCollisionMapGoal goal\n" +
"\n" +
"================================================================================\n" +
"MSG: std_msgs/Header\n" +
"# Standard metadata for higher-level stamped data types.\n" +
"# This is generally used to communicate timestamped data \n" +
"# in a particular coordinate frame.\n" +
"# \n" +
"# sequence ID: consecutively increasing ID \n" +
"uint32 seq\n" +
"#Two-integer timestamp that is expressed as:\n" +
"# * stamp.secs: seconds (stamp_secs) since epoch\n" +
"# * stamp.nsecs: nanoseconds since stamp_secs\n" +
"# time-handling sugar is provided by the client library\n" +
"time stamp\n" +
"#Frame this data is associated with\n" +
"# 0: no frame\n" +
"# 1: global frame\n" +
"string frame_id\n" +
"\n" +
"================================================================================\n" +
"MSG: actionlib_msgs/GoalID\n" +
"# The stamp should store the time at which this goal was requested.\n" +
"# It is used by an action server when it tries to preempt all\n" +
"# goals that were requested before a certain time\n" +
"time stamp\n" +
"\n" +
"# The id provides a way to associate feedback and\n" +
"# result message with specific goal requests. The id\n" +
"# specified must be unique.\n" +
"string id\n" +
"\n" +
"\n" +
"================================================================================\n" +
"MSG: arm_navigation_msgs/MakeStaticCollisionMapGoal\n" +
"# ====== DO NOT MODIFY! AUTOGENERATED FROM AN ACTION DEFINITION ======\n" +
"#The source to use to make the stable map\n" +
"string cloud_source\n" +
"\n" +
"#The number of clouds to compose the stable map\n" +
"int32 number_of_clouds\n" +
"\n" +
""; }
  public java.lang.String getMessageDefinition() { return __s_getMessageDefinition(); }

  public MakeStaticCollisionMapActionGoal clone() {
    MakeStaticCollisionMapActionGoal c = new MakeStaticCollisionMapActionGoal();
    c.deserialize(serialize(0));
    return c;
  }

  public void setTo(ros.communication.Message m) {
    deserialize(m.serialize(0));
  }

  public int serializationLength() {
    int __l = 0;
    __l += header.serializationLength();
    __l += goal_id.serializationLength();
    __l += goal.serializationLength();
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
    header.serialize(bb, seq);
    goal_id.serialize(bb, seq);
    goal.serialize(bb, seq);
  }

  public void deserialize(ByteBuffer bb) {
    header.deserialize(bb);
    goal_id.deserialize(bb);
    goal.deserialize(bb);
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof MakeStaticCollisionMapActionGoal))
      return false;
    MakeStaticCollisionMapActionGoal other = (MakeStaticCollisionMapActionGoal) o;
    return
      header.equals(other.header) &&
      goal_id.equals(other.goal_id) &&
      goal.equals(other.goal) &&
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    result = prime * result + (this.header == null ? 0 : this.header.hashCode());
    result = prime * result + (this.goal_id == null ? 0 : this.goal_id.hashCode());
    result = prime * result + (this.goal == null ? 0 : this.goal.hashCode());
    return result;
  }
} // class MakeStaticCollisionMapActionGoal

