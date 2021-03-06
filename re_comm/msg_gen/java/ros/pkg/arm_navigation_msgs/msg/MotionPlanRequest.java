/* Auto-generated by genmsg_java.py for file /opt/ros/fuerte/stacks/arm_navigation/arm_navigation_msgs/msg/MotionPlanRequest.msg */

package ros.pkg.arm_navigation_msgs.msg;

import java.nio.ByteBuffer;

public class MotionPlanRequest extends ros.communication.Message {

  public ros.pkg.arm_navigation_msgs.msg.WorkspaceParameters workspace_parameters = new ros.pkg.arm_navigation_msgs.msg.WorkspaceParameters();
  public ros.pkg.arm_navigation_msgs.msg.RobotState start_state = new ros.pkg.arm_navigation_msgs.msg.RobotState();
  public ros.pkg.arm_navigation_msgs.msg.Constraints goal_constraints = new ros.pkg.arm_navigation_msgs.msg.Constraints();
  public ros.pkg.arm_navigation_msgs.msg.Constraints path_constraints = new ros.pkg.arm_navigation_msgs.msg.Constraints();
  public java.lang.String planner_id = new java.lang.String();
  public java.lang.String group_name = new java.lang.String();
  public int num_planning_attempts;
  public ros.communication.Duration allowed_planning_time = new ros.communication.Duration();
  public ros.communication.Duration expected_path_duration = new ros.communication.Duration();
  public ros.communication.Duration expected_path_dt = new ros.communication.Duration();

  public MotionPlanRequest() {
  }

  public static java.lang.String __s_getDataType() { return "arm_navigation_msgs/MotionPlanRequest"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "75408e881303c6ad5069bd5df65ecb00"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "# This service contains the definition for a request to the motion\n" +
"# planner and the output it provides\n" +
"\n" +
"# Parameters for the workspace that the planner should work inside\n" +
"arm_navigation_msgs/WorkspaceParameters workspace_parameters\n" +
"\n" +
"# Starting state updates. If certain joints should be considered\n" +
"# at positions other than the current ones, these positions should\n" +
"# be set here\n" +
"arm_navigation_msgs/RobotState start_state\n" +
"\n" +
"# The goal state for the model to plan for. The goal is achieved\n" +
"# if all constraints are satisfied\n" +
"arm_navigation_msgs/Constraints goal_constraints\n" +
"\n" +
"# No state at any point along the path in the produced motion plan will violate these constraints\n" +
"arm_navigation_msgs/Constraints path_constraints\n" +
"\n" +
"# The name of the motion planner to use. If no name is specified,\n" +
"# a default motion planner will be used\n" +
"string planner_id\n" +
"\n" +
"# The name of the group of joints on which this planner is operating\n" +
"string group_name\n" +
"\n" +
"# The number of times this plan is to be computed. Shortest solution\n" +
"# will be reported.\n" +
"int32 num_planning_attempts\n" +
"\n" +
"# The maximum amount of time the motion planner is allowed to plan for\n" +
"duration allowed_planning_time\n" +
"\n" +
"# An expected path duration (in seconds) along with an expected discretization of the path allows the planner to determine the discretization of the trajectory that it returns\n" +
"duration expected_path_duration\n" +
"duration expected_path_dt\n" +
"\n" +
"================================================================================\n" +
"MSG: arm_navigation_msgs/WorkspaceParameters\n" +
"# This message contains a set of parameters useful in\n" +
"# setting up the workspace for planning\n" +
"arm_navigation_msgs/Shape  workspace_region_shape\n" +
"geometry_msgs/PoseStamped    workspace_region_pose\n" +
"\n" +
"\n" +
"================================================================================\n" +
"MSG: arm_navigation_msgs/Shape\n" +
"byte SPHERE=0\n" +
"byte BOX=1\n" +
"byte CYLINDER=2\n" +
"byte MESH=3\n" +
"\n" +
"byte type\n" +
"\n" +
"\n" +
"#### define sphere, box, cylinder ####\n" +
"# the origin of each shape is considered at the shape's center\n" +
"\n" +
"# for sphere\n" +
"# radius := dimensions[0]\n" +
"\n" +
"# for cylinder\n" +
"# radius := dimensions[0]\n" +
"# length := dimensions[1]\n" +
"# the length is along the Z axis\n" +
"\n" +
"# for box\n" +
"# size_x := dimensions[0]\n" +
"# size_y := dimensions[1]\n" +
"# size_z := dimensions[2]\n" +
"float64[] dimensions\n" +
"\n" +
"\n" +
"#### define mesh ####\n" +
"\n" +
"# list of triangles; triangle k is defined by tre vertices located\n" +
"# at indices triangles[3k], triangles[3k+1], triangles[3k+2]\n" +
"int32[] triangles\n" +
"geometry_msgs/Point[] vertices\n" +
"\n" +
"================================================================================\n" +
"MSG: geometry_msgs/Point\n" +
"# This contains the position of a point in free space\n" +
"float64 x\n" +
"float64 y\n" +
"float64 z\n" +
"\n" +
"================================================================================\n" +
"MSG: geometry_msgs/PoseStamped\n" +
"# A Pose with reference coordinate frame and timestamp\n" +
"Header header\n" +
"Pose pose\n" +
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
"MSG: geometry_msgs/Pose\n" +
"# A representation of pose in free space, composed of postion and orientation. \n" +
"Point position\n" +
"Quaternion orientation\n" +
"\n" +
"================================================================================\n" +
"MSG: geometry_msgs/Quaternion\n" +
"# This represents an orientation in free space in quaternion form.\n" +
"\n" +
"float64 x\n" +
"float64 y\n" +
"float64 z\n" +
"float64 w\n" +
"\n" +
"================================================================================\n" +
"MSG: arm_navigation_msgs/RobotState\n" +
"# This message contains information about the robot state, i.e. the positions of its joints and links\n" +
"sensor_msgs/JointState joint_state\n" +
"arm_navigation_msgs/MultiDOFJointState multi_dof_joint_state\n" +
"\n" +
"================================================================================\n" +
"MSG: sensor_msgs/JointState\n" +
"# This is a message that holds data to describe the state of a set of torque controlled joints. \n" +
"#\n" +
"# The state of each joint (revolute or prismatic) is defined by:\n" +
"#  * the position of the joint (rad or m),\n" +
"#  * the velocity of the joint (rad/s or m/s) and \n" +
"#  * the effort that is applied in the joint (Nm or N).\n" +
"#\n" +
"# Each joint is uniquely identified by its name\n" +
"# The header specifies the time at which the joint states were recorded. All the joint states\n" +
"# in one message have to be recorded at the same time.\n" +
"#\n" +
"# This message consists of a multiple arrays, one for each part of the joint state. \n" +
"# The goal is to make each of the fields optional. When e.g. your joints have no\n" +
"# effort associated with them, you can leave the effort array empty. \n" +
"#\n" +
"# All arrays in this message should have the same size, or be empty.\n" +
"# This is the only way to uniquely associate the joint name with the correct\n" +
"# states.\n" +
"\n" +
"\n" +
"Header header\n" +
"\n" +
"string[] name\n" +
"float64[] position\n" +
"float64[] velocity\n" +
"float64[] effort\n" +
"\n" +
"================================================================================\n" +
"MSG: arm_navigation_msgs/MultiDOFJointState\n" +
"#A representation of a multi-dof joint state\n" +
"time stamp\n" +
"string[] joint_names\n" +
"string[] frame_ids\n" +
"string[] child_frame_ids\n" +
"geometry_msgs/Pose[] poses\n" +
"\n" +
"================================================================================\n" +
"MSG: arm_navigation_msgs/Constraints\n" +
"# This message contains a list of motion planning constraints.\n" +
"\n" +
"arm_navigation_msgs/JointConstraint[] joint_constraints\n" +
"arm_navigation_msgs/PositionConstraint[] position_constraints\n" +
"arm_navigation_msgs/OrientationConstraint[] orientation_constraints\n" +
"arm_navigation_msgs/VisibilityConstraint[] visibility_constraints\n" +
"\n" +
"================================================================================\n" +
"MSG: arm_navigation_msgs/JointConstraint\n" +
"# Constrain the position of a joint to be within a certain bound\n" +
"string joint_name\n" +
"\n" +
"# the bound to be achieved is [position - tolerance_below, position + tolerance_above]\n" +
"float64 position\n" +
"float64 tolerance_above\n" +
"float64 tolerance_below\n" +
"\n" +
"# A weighting factor for this constraint\n" +
"float64 weight\n" +
"================================================================================\n" +
"MSG: arm_navigation_msgs/PositionConstraint\n" +
"# This message contains the definition of a position constraint.\n" +
"Header header\n" +
"\n" +
"# The robot link this constraint refers to\n" +
"string link_name\n" +
"\n" +
"# The offset (in the link frame) for the target point on the link we are planning for\n" +
"geometry_msgs/Point target_point_offset\n" +
"\n" +
"# The nominal/target position for the point we are planning for\n" +
"geometry_msgs/Point position\n" +
"\n" +
"# The shape of the bounded region that constrains the position of the end-effector\n" +
"# This region is always centered at the position defined above\n" +
"arm_navigation_msgs/Shape constraint_region_shape\n" +
"\n" +
"# The orientation of the bounded region that constrains the position of the end-effector. \n" +
"# This allows the specification of non-axis aligned constraints\n" +
"geometry_msgs/Quaternion constraint_region_orientation\n" +
"\n" +
"# Constraint weighting factor - a weight for this constraint\n" +
"float64 weight\n" +
"\n" +
"================================================================================\n" +
"MSG: arm_navigation_msgs/OrientationConstraint\n" +
"# This message contains the definition of an orientation constraint.\n" +
"Header header\n" +
"\n" +
"# The robot link this constraint refers to\n" +
"string link_name\n" +
"\n" +
"# The type of the constraint\n" +
"int32 type\n" +
"int32 LINK_FRAME=0\n" +
"int32 HEADER_FRAME=1\n" +
"\n" +
"# The desired orientation of the robot link specified as a quaternion\n" +
"geometry_msgs/Quaternion orientation\n" +
"\n" +
"# optional RPY error tolerances specified if \n" +
"float64 absolute_roll_tolerance\n" +
"float64 absolute_pitch_tolerance\n" +
"float64 absolute_yaw_tolerance\n" +
"\n" +
"# Constraint weighting factor - a weight for this constraint\n" +
"float64 weight\n" +
"\n" +
"================================================================================\n" +
"MSG: arm_navigation_msgs/VisibilityConstraint\n" +
"# This message contains the definition of a visibility constraint.\n" +
"Header header\n" +
"\n" +
"# The point stamped target that needs to be kept within view of the sensor\n" +
"geometry_msgs/PointStamped target\n" +
"\n" +
"# The local pose of the frame in which visibility is to be maintained\n" +
"# The frame id should represent the robot link to which the sensor is attached\n" +
"# The visual axis of the sensor is assumed to be along the X axis of this frame\n" +
"geometry_msgs/PoseStamped sensor_pose\n" +
"\n" +
"# The deviation (in radians) that will be tolerated\n" +
"# Constraint error will be measured as the solid angle between the \n" +
"# X axis of the frame defined above and the vector between the origin \n" +
"# of the frame defined above and the target location\n" +
"float64 absolute_tolerance\n" +
"\n" +
"\n" +
"================================================================================\n" +
"MSG: geometry_msgs/PointStamped\n" +
"# This represents a Point with reference coordinate frame and timestamp\n" +
"Header header\n" +
"Point point\n" +
"\n" +
""; }
  public java.lang.String getMessageDefinition() { return __s_getMessageDefinition(); }

  public MotionPlanRequest clone() {
    MotionPlanRequest c = new MotionPlanRequest();
    c.deserialize(serialize(0));
    return c;
  }

  public void setTo(ros.communication.Message m) {
    deserialize(m.serialize(0));
  }

  public int serializationLength() {
    int __l = 0;
    __l += workspace_parameters.serializationLength();
    __l += start_state.serializationLength();
    __l += goal_constraints.serializationLength();
    __l += path_constraints.serializationLength();
    __l += 4 + planner_id.length();
    __l += 4 + group_name.length();
    __l += 4; // num_planning_attempts
    __l += 8; // allowed_planning_time
    __l += 8; // expected_path_duration
    __l += 8; // expected_path_dt
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
    workspace_parameters.serialize(bb, seq);
    start_state.serialize(bb, seq);
    goal_constraints.serialize(bb, seq);
    path_constraints.serialize(bb, seq);
    Serialization.writeString(bb, planner_id);
    Serialization.writeString(bb, group_name);
    bb.putInt(num_planning_attempts);
    Serialization.writeDuration(bb, allowed_planning_time);
    Serialization.writeDuration(bb, expected_path_duration);
    Serialization.writeDuration(bb, expected_path_dt);
  }

  public void deserialize(ByteBuffer bb) {
    workspace_parameters.deserialize(bb);
    start_state.deserialize(bb);
    goal_constraints.deserialize(bb);
    path_constraints.deserialize(bb);
    planner_id = Serialization.readString(bb);
    group_name = Serialization.readString(bb);
    num_planning_attempts = bb.getInt();
    allowed_planning_time = Serialization.readDuration(bb);
    expected_path_duration = Serialization.readDuration(bb);
    expected_path_dt = Serialization.readDuration(bb);
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof MotionPlanRequest))
      return false;
    MotionPlanRequest other = (MotionPlanRequest) o;
    return
      workspace_parameters.equals(other.workspace_parameters) &&
      start_state.equals(other.start_state) &&
      goal_constraints.equals(other.goal_constraints) &&
      path_constraints.equals(other.path_constraints) &&
      planner_id.equals(other.planner_id) &&
      group_name.equals(other.group_name) &&
      num_planning_attempts == other.num_planning_attempts &&
      allowed_planning_time.equals(other.allowed_planning_time) &&
      expected_path_duration.equals(other.expected_path_duration) &&
      expected_path_dt.equals(other.expected_path_dt) &&
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    result = prime * result + (this.workspace_parameters == null ? 0 : this.workspace_parameters.hashCode());
    result = prime * result + (this.start_state == null ? 0 : this.start_state.hashCode());
    result = prime * result + (this.goal_constraints == null ? 0 : this.goal_constraints.hashCode());
    result = prime * result + (this.path_constraints == null ? 0 : this.path_constraints.hashCode());
    result = prime * result + (this.planner_id == null ? 0 : this.planner_id.hashCode());
    result = prime * result + (this.group_name == null ? 0 : this.group_name.hashCode());
    result = prime * result + this.num_planning_attempts;
    result = prime * result + (this.allowed_planning_time == null ? 0 : this.allowed_planning_time.hashCode());
    result = prime * result + (this.expected_path_duration == null ? 0 : this.expected_path_duration.hashCode());
    result = prime * result + (this.expected_path_dt == null ? 0 : this.expected_path_dt.hashCode());
    return result;
  }
} // class MotionPlanRequest

