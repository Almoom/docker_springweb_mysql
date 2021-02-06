FROM mysql:5.7

# COPY data/mysqlsampledatabase.sql /var/lib/mysql/

EXPOSE 3306
RUN echo "[mysqld]" >> /etc/mysql/my.cnf
RUN echo "explicit_defaults_for_timestamp = 1" >> /etc/mysql/my.cnf
RUN echo "" >> /etc/mysql/my.cnf

#docker build -t my .
