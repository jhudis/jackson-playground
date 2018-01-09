package students;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.jetbrains.annotations.NotNull;

/**
 * A student in the Magnet program.
 */
@JsonIdentityInfo(generator = ObjectIdGenerators.StringIdGenerator.class)
public class MagnetStudent extends Student {

	/**
	 * This student's score on the last AMC.
	 */
	private final int amcScore;


	/**
	 * Default constructor.
	 *
	 * @param grade The grade level this student is in.
	 * @param name  This student's name.
	 * @param amcScore    This student's score on the last AMC.
	 */
	@JsonCreator
	public MagnetStudent(@JsonProperty(required = false) int grade,
	                     @NotNull @JsonProperty(required = false) String name,
	                     @JsonProperty(required = false) int amcScore) {
		super(grade, name, 4.0);
		this.amcScore = amcScore;
	}

	/**
	 * @return This student's score on the last AMC.
	 */
	public int getAmcScore() {
		return amcScore;
	}

	/**
	 * @return A string representation of this student's grade, name, GPA, and amcScore.
	 */
	@Override
	public String toString() {
		return "students.MagnetStudent{" +
				"grade=" + getGrade() +
				", name=" + getName() +
				", gpa=" + getGpa() +
				", amcScore=" + getAmcScore() +
				"}";
	}
}
